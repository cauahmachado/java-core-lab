package controlstructures;/*Desenvolva um sistema que avalie se uma pessoa pode obter um
empréstimo bancário. O programa deve considerar múltiplos critérios e calcular
um score de crédito.
Critérios de Avaliação:
• Idade (18-25: baixo score, 26-60: score normal, 61+: score reduzido)
• Renda mensal (multiplicador do score)
• Tempo de emprego (menos de 1 ano: penalidade, 1-5 anos: normal, 5+:
bonus)
• Histórico de crédito: Excelente (+50 pontos), Bom (+25), Regular (0), Ruim (-
30)
• Estado civil: Casado (+10 pontos), outros (0)
• Dependentes: cada dependente (-5 pontos)
Score base: 100 pontos Aprovação: Score ≥ 150 e renda ≥ R$ 2000
Desafio adicional: Calcule o valor máximo do empréstimo (baseado na renda) e a
taxa de juros (baseada no score).*/

import java.util.Scanner;


public class Exercicio22 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        int baseScore = 100;

        int ageScore;
        int employmentScore;
        int creditHistoryScore;
        int maritalStatusScore;
        int dependentsScore;

        double incomeMultiplier;
        int loanMultiplier;

        double finalScore;
        double maxLoanValue;


        System.out.println("Age:");
        int age = scan.nextInt();

        System.out.println("Monthly income:");
        double income = scan.nextDouble();

        System.out.println("Employment time (years):");
        int employmentYears = scan.nextInt();

        scan.nextLine(); // clear buffer

        System.out.println("Credit history (excellent / good / regular / bad):");
        String creditHistory = scan.nextLine().toLowerCase();

        System.out.println("Marital status:");
        String maritalStatus = scan.nextLine().toLowerCase();

        System.out.println("Dependents:");
        int dependents = scan.nextInt();


        if (age >= 18 && age <= 25) {
            ageScore = -20;
        } else if (age <= 60) {
            ageScore = 0;
        } else {
            ageScore = -15;
        }


        if (income < 2000) {
            incomeMultiplier = 0.5;
            loanMultiplier = 5;
        } else if (income < 5000) {
            incomeMultiplier = 1.0;
            loanMultiplier = 10;
        } else {
            incomeMultiplier = 1.2;
            loanMultiplier = 15;
        }


        if (employmentYears < 1) {
            employmentScore = -30;
        } else if (employmentYears < 5) {
            employmentScore = 0;
        } else {
            employmentScore = 20;
        }


        if (creditHistory.equals("excellent")) {
            creditHistoryScore = 50;
        } else if (creditHistory.equals("good")) {
            creditHistoryScore = 25;
        } else if (creditHistory.equals("regular")) {
            creditHistoryScore = 0;
        } else {
            creditHistoryScore = -30;
        }


        if (maritalStatus.equals("married")) {
            maritalStatusScore = 10;
        } else {
            maritalStatusScore = 0;
        }


        dependentsScore = dependents * (-5);


        finalScore = baseScore
                + ageScore
                + employmentScore
                + creditHistoryScore
                + maritalStatusScore
                + dependentsScore;


        maxLoanValue = income * loanMultiplier;


        if (finalScore >= 150 && income >= 2000) {
            System.out.println("Loan approved");

            System.out.println("Interest rate:");
            if (finalScore >= 200) {
                System.out.println("1.5% per month");
            } else if (finalScore >= 170) {
                System.out.println("2.0% per month");
            } else {
                System.out.println("2.5% per month");
            }

            System.out.println("Maximum loan value: " + maxLoanValue);
        } else {
            System.out.println("Loan denied");
        }
    }
}
