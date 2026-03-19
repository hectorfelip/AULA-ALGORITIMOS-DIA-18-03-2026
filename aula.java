import java.util.Scanner;

public class aula{
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double num;
        double hora;
        double temp;
        double altura;
        double peso;
        double imc;
        double idade;
        double compra;
        double desconto;
        int escolha;
        double salario;
        double aumento;
        double salariov;
        double rendimento;
        double imposto;

        // POSITIVO, NEGATIVO OU NULO!

        System.out.println("DEFINA UM NÚMERO: ");
        num = leitor.nextDouble();

        if (num > 0){
            System.out.println("positivo!");
        }else if (num < 0){
            System.out.println("Negativo");
        }else{
            System.out.println("Nulo!");
        }

        // BOM DIA, BOA NOITE, BOA TARDE

        System.out.println("QUE HORAS SÃO? ");
        hora = leitor.nextDouble();

        if(hora < 0 || hora > 23){
            System.out.println("Um horário correto!");
            return;
        }

        if (hora < 12){
            System.out.println("Bom dia!");
        }else if (hora < 18){
            System.out.println("Boa tarde!");
        }else{
            System.out.println("Boa noite!");
        }

        // ESTADO DA AGUA

        System.out.println("QUAL A TEMPERATURA DA AGUA? ");
        temp = leitor.nextDouble();

        if (temp < -273){
            System.out.println("Insira uma temperatura válida!");
        }

        if(temp < 0){
            System.out.println("A agua é sólida!");
        }else if (temp < 100){
            System.out.println("A agua está liquida!");
        }else{
            System.out.println("A agua está em estado gasoso");
        }

        // IMC

        System.out.println("Qual o seu peso? ");
        peso = leitor.nextDouble();
        System.out.println("Qual a sua altura? ");
        altura = leitor.nextDouble();

        if(peso <= 0 || altura <= 0){
            System.out.println("Insira dados válidos!");
        }

        imc = peso/(altura*altura);

        if (imc <= 18.5){
            System.out.println("Abaixo do peso!");
        }else if(imc <= 25){
            System.out.println("Peso normal!");
        }else if(imc <= 30){
            System.out.println("Acima do peso!");
        }else{
            System.out.println("Obeso!");
        }

        // CATEGORIA DE DESPORTO
        
        System.out.println("Defina a idade do índividuo: ");
        idade = leitor.nextDouble();

        if (idade < 0){
            System.out.println("Defina uma idade válida!");
            return;
        }

        if(idade < 10){
            System.out.println("infantil!");
        }else if(idade < 15){
            System.out.println("juvenil!");
        }else if(idade < 18){
            System.out.println("júnior!");
        }else{
            System.out.println("Senior!");
        }

        // DESCONTO

        System.out.println("Qual o valor da compra? ");
        compra = leitor.nextDouble();

        if (compra <= 0){
            System.out.println("Defina um valor válido!");
        }

        if(compra >= 1000){
            desconto = compra * 0.2;
            compra = compra - desconto;
            System.out.println("Sua compra é de: " + compra);
        }else if (compra >= 500){
            desconto = compra * 0.1;
            compra = compra - desconto;
            System.out.println("Sua compra é de: " + compra);
        }else if (compra >= 100){
            desconto = compra * 0.05;
            compra = compra - desconto;
            System.out.println("Sua compra é de: " + compra);
        }else{
            System.out.println("Sua compra é de: " + compra);
        }

        // MENU NUMERADO

        System.out.println("Escolha entre:\n 1- Hambúrguer\n 2- Pizaa\n 3- Salada");
        escolha = leitor.nextInt();

        if (escolha == 1){
            System.out.println("Hambúrguer custa 68R$!");
        }else if (escolha == 2){
            System.out.println("Pizza custa 67 R$!");
        }else if (escolha == 3) {
            System.out.println("Salada custa 69R$!");
        }else{
            System.out.println("Escolha um número entre 1 a 3!");
        }

        //AUMENTO SALARIAL

        System.out.println("Insira o seu salário: ");
        salario = leitor.nextDouble();

        if (salario <= 0){
            System.out.println("Insira um salário válido!");
        }

        if (salario < 2000){
            salariov = salario;
            aumento = salario * 0.1;
            salario = salario + aumento;
            System.out.println("Seu salário era de " + salariov + "teve um aumento de " + aumento + "agora seu salário é de :" + salario);
        }else if (salario < 1000) {
            salariov = salario;
            aumento = salario * 0.15;
            salario = salario + aumento;
            System.out.println("Seu salário era de " + salariov + "teve um aumento de " + aumento + "agora seu salário é de :" + salario);
        }else{
            salariov = salario;
            aumento = salario * 0.05;
            salario = salario + aumento;
            System.out.println("Seu salário era de " + salariov + "teve um aumento de " + aumento + "agora seu salário é de :" + salario);
        }

        // IMPOSTO PROGRESSIVO

        System.out.println("Qual foi o seu rendimento esse mês? ");
        rendimento = leitor.nextDouble();

        if (rendimento <= 0){
            System.out.println("Insira um valor válido!");
            return;
        }

        if ( rendimento < 10000){
            System.out.println("você terá que pagar nada de imposto!");
        }else if(rendimento <20000){
            imposto = rendimento * 0.1;
            System.out.println("você terá que pagar "+ imposto + "de imposto!");
        }else if(rendimento < 50000){
            imposto = rendimento * 0.2;
            System.out.println("você terá que pagar "+ imposto + "de imposto!");
        }else{
            imposto = rendimento * 0.3;
            System.out.println("você terá que pagar "+ imposto + "de imposto!");
        }
    }
}