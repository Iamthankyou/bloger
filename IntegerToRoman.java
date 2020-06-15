class Solution {
    public String intToRoman(int num) {
        StringBuilder res = new StringBuilder();
        while (num>0){
            if (num>=1000 && num-1000>=0){
                res.append("M");
                num-=1000;
            }
            else if (num>=900 && num-900>=0){
                res.append("CM");
                num-=900;
            }
            else if (num>=500 && num-500>=0){
                res.append("D");
                num-=500;
            }
            else if (num>=400 && num-400>=0){
                res.append("CD");
                num-=400;
            }
            else if (num>=100 && num-100>=0){
                res.append("C");
                num-=100;
            }
            else if (num>=90 && num-90>=0){
                res.append("XC");
                num-=90;
            }
            else if (num>=50 && num-50>=0){
                res.append("L");
                num-=50;
            }
            else if (num>=40 && num-40>=0){
                res.append("XL");
                num-=40;
            }
            else if (num>=10 && num-10>=0){
                res.append("X");
                num-=10;
            }
            else if (num>=9 && num-9>=0){
                res.append("IX");
                num-=9;
            }
            else if (num>=5 && num-5>=0){
                res.append("V");
                num-=5;
            }
            else if (num>=4 && num-4>=0){
                res.append("IV");
                num-=4;
            }
            else if (num>=1 && num-1 >=0){
                res.append("I");
                num-=1;
            }
        }
        
        return res.toString(); 
    }
    
    private String roman(int num){
        switch(num){
            case 1: return "I";
            case 5: return "V";
            case 10: return "X";
            case 50: return "L";
            case 100: return "C";
            case 500: return "D";
            case 1000: return "M";
            case 4: return "IV";
            case 9: return "IX";
            case 40: return "XL";
            case 90: return "XC";
            case 400: return "CD";
            case 900: return "CM";
        }
        
        return "";
    }
}
