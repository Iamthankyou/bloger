//duynotes.blogspot.com
private int priority(Character c) {
		switch (c) {
		case '+':
		case '-':
			return 1;
		case 'x':
		case '/':
			return 2;
		}

		return -1;
	}

	private List<String> toPostfix(List<String> infix) {
		List<String> result = new ArrayList<>();
		Stack<String> stack = new Stack<>();

		for (String i : infix) {
			if (!i.equals("/") && !i.equals("x") && !i.equals("-") && !i.equals("+")) {
				result.add(i);
			}
			else {
				while (!stack.isEmpty() && priority(i.charAt(0)) <= priority(stack.peek().charAt(0))) {
					result.add(stack.pop());
				}
				
				stack.push(i);
			}
		}
		
		while (!stack.isEmpty()) {
			result.add(stack.pop());
		}
		System.out.println(result);
		return result;
	}
	
	private double evalutionPostfix(List<String> list) {
		Stack<Double> stack = new Stack<>();
		
		for (String i:list) {
			if (!i.equals("/") && !i.equals("x") && !i.equals("-") && !i.equals("+")) {
				stack.push(Double.parseDouble(i));
			}
			else {
				double one = stack.pop();
				double two = stack.pop();
				
				if (i.equals("+")){
					stack.push(one+two);
				}
				else if (i.equals("-")){
					stack.push(one-two);
				}
				else if (i.equals("x")){
					stack.push(one*two);
				}
				else if (i.equals("/")){
					stack.push(two/one);
				}
			}
		}
		
		return stack.pop();
	}
