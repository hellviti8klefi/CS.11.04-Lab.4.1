public class Main {

    // 1. parenthesesCheck
    public static boolean parenthesesCheck(String s) {
        int count = 0;
        for (char a : s.toCharArray()) {
            if (a == '(') {
                count++;
            } else if (a == ')') {
                count--;
            }
            if (count < 0) {
                return false;
            }
        }

        return count == 0;
    }

    // 2. reverseInteger
    public static String reverseInteger(int num) {
        StringBuilder r = new StringBuilder(); // r = reversed
        boolean isNegative = num < 0;
        num = Math.abs(num);
        while (num > 0) {
            r.append(num % 10);
            num /= 10;
        }
        if (isNegative) {
            r.append('-');
        }
        return r.toString();
    }


    // 3. encryptThis
    public static String encryptThis(String message) {
        String[] words = message.split(" ");
        StringBuilder done = new StringBuilder();

        for (String wo : words) {
            if (wo.isEmpty()) {
                continue;
            }
            StringBuilder ew = new StringBuilder();
            ew.append((int) wo.charAt(0));
            if (wo.length()>1) {

                if (wo.length() > 2) {
                    char slet = wo.charAt(1);
                    char llet = wo.charAt(wo.length() - 1);
                    ew.append(llet).append(wo.substring(2, wo.length()-1)).append(slet);
                } else {
                    ew.append(wo.charAt(1));
                }
            }
            done.append(ew).append(" ");
            }

        if (done.length() > 0) {
            done.setLength(done.length()-1);
        }
        return done.toString();
    }




    // 4. decipherThis
    public static String decipherThis(String message) {
        String[] ws = message.split(" ");
        StringBuilder ddedM = new StringBuilder();

        for (String w : ws) {
            StringBuilder cw = new StringBuilder();
            int index = 0;

            while (index < w.length() && Character.isDigit(w.charAt(index))) {
                index++;
            }
            if (index > 0) {
                int cc = Integer.parseInt(w.substring(0, index));
                cw.append((char) cc);
            }

            if (index < w.length()) {
                String r = w.substring(index);
                if (r.length() > 1) {
                     cw.append(r.charAt(r.length()-1));
                     cw.append(r.substring(1,r.length()-1));
                     cw.append(r.charAt(0));
                 } else  if (r.length() == 1) {
                    cw.append(r.charAt(0));
                }
            }
            ddedM.append(cw).append(' ');
        }
        if (ddedM.length() > 0) {
            ddedM.setLength(ddedM.length() - 1);
        }
        return ddedM.toString();
    }

}