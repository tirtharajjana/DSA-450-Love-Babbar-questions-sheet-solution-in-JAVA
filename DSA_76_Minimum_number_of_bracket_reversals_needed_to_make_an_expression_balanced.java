package DSA;

public class DSA_76_Minimum_number_of_bracket_reversals_needed_to_make_an_expression_balanced {
    static int countMinReversals(String expr){
        int len=expr.length();
        int ans;

        int lb=0,rb=0;

        for (int i = 0; i < len; i++) {
            if(expr.charAt(i) == '{')
                lb++;
            else {
                if(lb == 0)
                    rb++;
                else
                    lb--;
            }

        }
        ans= (int)(Math.ceil((0.0 + lb) / 2) + Math.ceil((0.0 + rb) / 2));
        return ans;
    }
    public static void main(String[] args) {
//        String expr = "}}{{";
        String expr = "}{{}}{{{";

        System.out.println(countMinReversals(expr));
    }
}
