public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "M";

        if (plano == "B"){
            System.out.println("100 minutos de ligação");
        }
        else if (plano == "M"){
            System.out.println("100 minutos de ligação + Whats e Insta grátis");
        }
        else if (plano == "T") {
            System.out.println("100 minutos de ligação + Whats e Insta grátis + 5gb Youtube");
        }
        else 
        System.out.println("INDEFINIDO");

        //OU

        switch (plano) {
            case "T": {
                System.out.println("5gb Youtube");
            }
            case "M" : {
                System.out.println("Whats e Insta grátis");
            }
            case "B" : {
                System.out.println("100 minutos de ligação");
            }
                
        }
    }
}
