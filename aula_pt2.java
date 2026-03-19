import java.util.Scanner;


public class aula_pt2 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        //DISTRIBUIÇÃO

        boolean foraDoPais;
        String destino;
        int unidades;
        int preco;

        System.out.println("A entrega é para fora do país? ");
        destino = leitor.nextLine();

        System.out.println("Quantas unidades serão transportadas? ");
        unidades = leitor.nextInt();

        if (destino.equals("sim")){
            foraDoPais = true;
        }else if(destino.equals("não")){
            foraDoPais = false;
        }else{
            System.out.println("Responda com sim ou nâo!");
            return;
        }

        if( unidades > 50 && foraDoPais == true){
            preco = 500;
            System.out.print("O total a pagar é de " + preco);
        }else if( unidades <= 50 && foraDoPais == true){
            preco = 300;
            System.out.print("O total a pagar é de " + preco);
        }else if(foraDoPais == false){
            preco = 0;
            System.out.print("O total a pagar é de " + preco);
        }

        //crédito automático
        String temFiador;
        double idade;
        double renda;

        System.out.println("Qual a sua renda? ");
        renda = leitor.nextDouble();
        System.out.println("Qual a sua idade? ");
        idade = leitor.nextDouble();

        if (idade >= 21 && renda > 3000){
            System.out.println("Impréstimo aprovado! ");
        }else if(idade < 21 || renda < 3000){
            System.out.println("Você possui um fiador? ");
            temFiador = leitor.nextLine();

            if (temFiador.equals("sim")){
                System.out.println("Impréstimo aprovado! ");
            }else if (temFiador.equals("não")){
                System.out.println("Impréstimo negado! ");
            }

        }

        // RH
        String dominio;
        int qdominio;
        int experiencia;

        System.out.println("Você domina java ou kotlin? ");
        dominio = leitor.nextLine();
        System.out.println("Quantas você domina (responda com 0,1 ou 2)? ");
        qdominio = leitor.nextInt();
        System.out.println("Quanto tempo de experiencia? ");
        experiencia = leitor.nextInt();

        if ( dominio.equals("sim")&& qdominio == 2 && experiencia >5){
            System.out.println("Segue para entrevista! ");
        }else if (dominio.equals("sim") && qdominio == 1 && experiencia <= 5){
            System.out.println("Nível pleno!");
        }else if ( dominio.equals("não")){
            System.out.println("Não segue para entrevista!");
        }
        
        // ACESSO FÍSICO

        String adm1;
        String facial1;
        String digital1;

        System.out.println("Usuario administrador? ");
        adm1 = leitor.nextLine();
        System.out.println("Facial reconhecida? ");
        facial1 = leitor.nextLine();
        System.out.println("Digital reconhecida? ");
        digital1 = leitor.nextLine();

        if ( adm1.equals("sim") && facial1.equals("sim") || digital1.equals("sim")){
            System.out.println(" Liberado! ");
        }else if ( adm1.equals("não") && facial1.equals("sim") && digital1.equals("sim")){
            System.out.println(" Liberado! ");
        }else{
            System.out.println(" Barrado! ");
        }
        
        // vendas

        double vendas;
        int itens;
        double bonus;

        System.out.println("Quanto em vendas o vendedor fez? ");
        vendas = leitor.nextDouble();
        System.out.println("Quantos itens o vendedor vendeu? ");
        itens = leitor.nextInt();

        if(vendas > 100000){
            bonus = vendas * 0.1;
            System.out.println(bonus);
        }else if( vendas > 50000 && itens >= 10){
            bonus = vendas * 0.05;
            System.out.println(bonus);
        }else if ( vendas > 50000 && itens <= 10){
            bonus = vendas * 0.02;
            System.out.println(bonus);
        }else if ( vendas < 50000){
            bonus = vendas * 0;
            System.out.println(bonus);
        }
        
        // validação

        String vip;
        String liquidacao;
        int precoss;

        System.out.println("Usuário vip? ");
        vip = leitor.nextLine();
        System.out.println("Produto em liquidação? ");
        liquidacao = leitor.nextLine();
        System.out.println("Preco da compra? ");
        precoss = leitor.nextInt();

        if ( vip.equals("sim") && liquidacao.equals("não") && precoss >= 200){
            System.out.println(" TEM DESCONTO ");
        }else{
            System.out.println(" NÃO TEM DESCONTO ");
        }
        
        //RISCO

        String invs;
        int prej;
        int exp;

        System.out.println("INVESTE VALORES ALTOS? ");
        invs = leitor.nextLine();
        System.out.println("JÁ TEVE PREJUIZO QUANTAS VEZES? ");
        prej = leitor.nextInt();
        System.out.println("QUANTO TEMPO DE EXPERIENCIA? ");
        exp = leitor.nextInt();

        if ( invs.equals("sim") && prej > 10 && exp > 5){
            System.out.println(" Moderado ");
        }else if (invs.equals("não")){
            System.out.println(" Conservador ");
        }else{
            System.out.println(" Arrojado ");
        }
        
        
        

    }
}
