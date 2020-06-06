 {
    public int[][] reconstructQueue(int[][] people) {
        
        Arrays.sort(people,new Comparator<int[]>(){
            @Override
            public int compare(int[] a, int b[]){
                if (b[0] != a[0]){
                    return b[0] - a[0];
                }
                    return a[1] - b[1];
            }
        });
        
        List<int[]> list = new LinkedList<>();
        
        for (int arr[]:people){
            list.add(arr[1],arr);
        }
        
        for (int i=0; i<list.size(); i++){
            people[i] = list.get(i);
        }
        return people;
    }
}

