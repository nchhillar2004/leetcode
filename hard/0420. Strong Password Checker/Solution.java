class Solution {
    public int strongPasswordChecker(String password) {
        int n = password.length();
        if (n == 0) return 6;
        if (n == 1) return 5;

        char[] carr = password.toCharArray();
        int[] arr = new int[n];
        int steps = 0;
        boolean hasLowerCase = false, hasUpperCase = false, hasDigit = false;

        for (int i = 0; i < n;){
            if (Character.isLowerCase(carr[i])) hasLowerCase = true;
            if (Character.isUpperCase(carr[i])) hasUpperCase = true;
            if (Character.isDigit(carr[i])) hasDigit = true;
            
            int j = i;
            while (i < n && carr[i] == carr[j]) i++;
            arr[j] = i - j;
        }

        int missingSteps = (hasLowerCase ? 0 : 1) + (hasUpperCase ? 0 : 1) + (hasDigit ? 0 : 1);

        if (n < 6){
            steps += missingSteps + Math.max(0, 6 - (n + missingSteps));
        } else{
            int extraLen = Math.max(n-20, 0);
            int leftOver = 0;
            steps += extraLen;

            for (int k = 1; k < 3; k++){
                for (int i = 0; i < n && extraLen > 0; i++){
                    if (arr[i] < 3 || arr[i]%3 != (k-1)) continue;
                    arr[i] -= Math.min(extraLen, k);
                    extraLen -= k;
                }
            }

            for (int i = 0; i < n; i++){
                if (arr[i] >= 3 && extraLen > 0){
                    int need = arr[i] - 2;
                    arr[i] -= extraLen;
                    extraLen -= need;
                }

                if (arr[i] >= 3) leftOver += arr[i] / 3;
            }

            steps += Math.max(missingSteps, leftOver);
        }

        return steps;
    }
}
