package com.cydeo.task.transactionTask;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TransactionTest {

    public static void main(String[] args) {


        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );

        //1. Find all transactions in the year 2011 and sort them by value(small to high)

        List<Transaction> transactionList = transactions
                .stream()
                .filter(i -> i.getYear() == 2011)
                .sorted(Comparator.comparing(Transaction::getValue))
                .collect(Collectors.toList());

        System.out.println(transactionList);

        System.out.println("---------------------------------------------");

        //2. What are all the unique cities where the traders work?

        List<String> uniqueCities = transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getCity)
                .distinct()
                .collect(Collectors.toList());

        System.out.println(uniqueCities);

        System.out.println("---------------------------------------------");

        //3. Find all traders from Cambridge and sort them by name.

        List<String> traderNames = transactions.stream()
                .map(Transaction::getTrader)
                .filter(i -> i.getCity().equalsIgnoreCase("cambridge"))
                .map(Trader::getName)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(traderNames);


        //4. Return a string of all traders’ names sorted alphabetically.
        //5. Are any traders based in Milan?
        //6. Print the values of all transactions from the traders living in Cambridge.
        //7. What is the highest value of all the transactions?
        //8. Find the transaction with the smallest value.


    }
}
