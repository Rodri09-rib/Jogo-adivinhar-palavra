import java.util.Scanner;
 public static void main(String[] args) {
     Scanner leitor = new Scanner(System.in);

     String jogarnovamente = "S";
     boolean dica = false;


     while (jogarnovamente.equalsIgnoreCase("s")){

     System.out.println ("|------------------------|");
     System.out.println ("|-- ADIVINHE A PALAVRA --|");
     System.out.println ("|------------------------|");
     System.out.println (" ");

     System.out.println ("Adivinhe a palavra: _ _ _ _");
     System.out.println (" ");
     System.out.println ("Quer uma dica? (s/n)");
     System.out.println (" ");
     String resp = leitor.nextLine();
     if (resp.equalsIgnoreCase("s")){
         dica = true;{
             System.out.println ("Dica = 💘😍");
         }
     } else {System.out.println ("Então vamos no modo difícil!");}
     System.out.println (" ");
     System.out.println ("Adivinhe a palavra: _ _ _ _");
     System.out.println (" ");


     for (int c = 3; c >= 0; c --){

       String r = leitor.nextLine();
       if (r.equalsIgnoreCase("amor")){
           System.out.println ("Correto!");


               break;
           }else {System.out.println("Incorreto! tente novamente! você tem: " + c + " tentativas");

       }
        if (c == 0){
            System.out.println ("Suas tentativas acabaram! Fim de jogo!");
        }



     } System.out.println ("Deseja jogar novamente? (s/n):");
       jogarnovamente = leitor.nextLine(); }
      if (jogarnovamente.equalsIgnoreCase("n"));{
          System.out.println ("Obrigado por jogar!");
     }

 }