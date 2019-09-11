
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author user
 */
public class Main extends Common {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ad_op;

        while (true) {
            System.out.println("Enter system as: " + "\n" + "1.Admin\n2.Waiter\n3.Cashier\nEnter the number beside the type of user: ");
            int n = sc.nextInt();

            if (n == 1) {
                String decision = "Go back";
                while (decision.equals("Go back")) {
                    Admin admin = new Admin();
                    System.out.println("Choose options: " + "\n"
                            + "1.Add food category" + "\n"
                            + "2.Add food item" + "\n"
                            + "3.Add new waiter" + "\n"
                            + "4.Add new cashier" + "\n Choose by entering the number beside option"
                            + " \n Type go back to access admin options and exit to stop");
                    ad_op = sc.nextInt();
                    sc.nextLine();
                    if (ad_op == 1) {
                        System.out.println("Enter category name: ");
                        String name = sc.nextLine();
                        System.out.println("Enter category description: ");
                        String des = sc.nextLine();
                        admin.add_category(name, des);
                        System.out.println("Enter route: ");
                        decision = sc.nextLine();

                    } else if (ad_op == 2) {
                        System.out.println("Enter category number you want to add to.Press 0 if first category");
                        int cat_num = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Enter food name: ");
                        String food_name = sc.nextLine();
                        System.out.println("Give food description: ");
                        String food_des = sc.nextLine();
                        System.out.println("Enter food price: ");
                        int food_price = sc.nextInt();
                        sc.nextLine();
                        admin.add_food(category[cat_num], food_name, food_des, food_price);
                        System.out.println("Enter route: ");
                        decision = sc.nextLine();

                    } else if (ad_op == 3) {
                        System.out.println("Enter waiter name: ");
                        String wait_name = sc.nextLine();
                        System.out.println("Enter waiter salary: ");
                        int wait_sal = sc.nextInt();
                        sc.nextLine();
                        admin.add_waiter(wait_name, wait_sal);
                        System.out.println("Enter route: ");
                        decision = sc.nextLine();

                    } else if (ad_op == 3) {
                        System.out.println("Enter cashier name: ");
                        String cash_name = sc.nextLine();
                        System.out.println("Enter cashier salary: ");
                        int cash_sal = sc.nextInt();
                        sc.nextLine();
                        admin.add_waiter(cash_name, cash_sal);
                        System.out.println("Enter route: ");
                        decision = sc.nextLine();

                    }
                }
            } else if (n == 2) {
                String text = "Go back";
                Waiter w = new Waiter();
                while (text.equals("Go back")) {
                    System.out.println("Choose options: " + "\n"
                            + "1.Check list" + "\n"
                            + "2.Add meal" + "\n"
                            + "3.Place order" + "\n"
                            + "4.Show order" + "\n Choose by entering the number beside option"
                            + " \n Type go back to access admin options and exit to stop");
                    ad_op = sc.nextInt();
                    sc.nextLine();
                    if (ad_op == 1) {
                        w.check_list();
                        System.out.println("Enter route: ");
                        text = sc.nextLine();
                    } else if (ad_op == 2) {
                        System.out.println("Select category number: ");
                        int n1 = sc.nextInt();
                        System.out.println("Select item number: ");
                        int n2 = sc.nextInt();
                        sc.nextLine();
                        w.add_meal(category[n1].food[n2]);
                        System.out.println("Enter route: ");
                        text = sc.nextLine();
                    } else if (ad_op == 3) {
                        w.place_order();
                        System.out.println("Enter route: ");
                        text = sc.nextLine();
                    } else if (ad_op == 4) {
                        w.show_order();
                        System.out.println("Enter route: ");
                        text = sc.nextLine();
                    }
                }

            } else if (n == 3) {
                Cashier c = new Cashier();
                c.check_earnings();
            }

        }
    }
}
/*Cashier c=new Cashier();
 c.check_earnings();*/
