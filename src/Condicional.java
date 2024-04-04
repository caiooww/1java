public class Condicional {
    public static void main(String[] args) {
        int ano = 2022;
        boolean incluso = false;
        String plano ="premium";

        if (ano >= 2022){
            System.out.println("Lançamento");
        } else {
            System.out.println("Não é lançamento");
        }

        if (incluso || plano.equals("premium")) {
            System.out.println("Incluso no seu plano");
        } else {
            System.out.println("Não incluso com seu plano");
        }
    }
}
