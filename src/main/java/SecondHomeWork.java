import java.text.DecimalFormat;
public class SecondHomeWork {
    public static void main(String[] args) {
        String s1 = "first ferret, second ferret, otter, third ferret";
        String s2 = "otter,";
        int index = s1.indexOf(s2);
        System.out.println(index);

        String first_string = "ferret";
        String second_string = "terref";
        System.out.println(first_string.equals(new StringBuilder(second_string).reverse().toString()));

        int num1 = 17;
        int num2 = 24;

        StringBuilder str_res = new StringBuilder();
        str_res.append(num1 + " + " + num2 + " = " + (num1+num2));
        System.out.println(str_res);

        StringBuilder str_res1 = new StringBuilder();
        str_res1.append(num1 + " - " + num2 + " = " + (num1-num2));
        System.out.println(str_res1);

        //System.out.println(new StringBuilder().append(num1 + " * " + num2 + " = " + (num1*num2)));
        StringBuilder str_res2 = new StringBuilder();
        str_res2.append(num1).append(" * ").append(num2).append(" = ").append(num1*num2);
        System.out.println(str_res2);

        double d = (double) num1 / num2;
        StringBuilder str_res3 = new StringBuilder();
        str_res3.append(num1).append(" / ").append(num2).append(" = ").append(new DecimalFormat("#.#####").format(d));
        System.out.println(str_res3);
        //System.out.println(new StringBuilder().append(num1 + " / " + num2 + " = " + new DecimalFormat("#.#####").format(d)));

        System.out.println(str_res.deleteCharAt(8).insert(8, "равно"));
        System.out.println(str_res1.deleteCharAt(8).insert(8, "равно"));
        System.out.println(str_res2.deleteCharAt(8).insert(8, "равно"));
        System.out.println(str_res3.deleteCharAt(8).insert(8, "равно"));


        StringBuilder more_replace = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            more_replace.append("=");
        }

        long start1 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            more_replace.replace(i*5,i*5+1,"равно");
        }
        long end1 = System.currentTimeMillis();
        System.out.println(end1-start1);

        String str_new = more_replace.toString();
        long start2 = System.currentTimeMillis();
        str_new.replaceAll("=","равно");
        long end2 = System.currentTimeMillis();
        System.out.println(end2-start2);
    }
}

