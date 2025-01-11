class Solution {
    public int distMoney(int money, int children) {
        int result = 0;
        if(money<children) return -1;
        money -= children;
        if(money < 7) return result;

        while(money >= 7 && children>0){
            money -= 7;
            result++;
            children--;
            if (children==1 && money==3) result--;
            else if (money > 0 && children==0) result--;
        }

        return result;
    }
}
