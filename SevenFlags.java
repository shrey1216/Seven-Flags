//@author Shreyan Wankavala
//112634232
//Recitation 01

import java.util.Scanner;

public class SevenFlags {
    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);

        System.out.print("\nWelcome to Seven Flags!\n");

        System.out.print("\nPlease enter the number of regular customers:");
        int reg = scan.nextInt();
        while(reg < 0){
            System.out.print("The number cannot be negative! Try again:");
            reg = scan.nextInt();
        }
        Person[] regular = new Person[reg];
        for(int i = 0; i < reg; i++){
            Person person = new Person(i + 1, 1);
            regular[i] = person;
        }


        System.out.print("Please enter the number of silver customers:");
        int silv = scan.nextInt();
        while(silv < 0){
            System.out.print("The number cannot be negative! Try again:");
            silv = scan.nextInt();
        }
        Person[] silver = new Person[silv];
        for(int i = 0; i < silv; i++){
            Person person = new Person(i + 1, 2);
            silver[i] = person;
        }

        System.out.print("Please enter the number of gold customers:");
        int gol = scan.nextInt();
        while(gol < 0){
            System.out.print("The number cannot be negative! Try again:");
            gol = scan.nextInt();
        }
        Person[] gold = new Person[gol];
        for(int i = 0; i < gol; i++){
            Person person = new Person(i + 1, 3);
            gold[i] = person;
        }

        System.out.print("Please enter the simulation length:");
        int simLength = scan.nextInt();
        while(simLength < 0){
            System.out.print("The number cannot be negative! Try again:");
            simLength = scan.nextInt();
        }

        System.out.print("\nPlease enter the duration of Blue Scream of Death (minutes):");
        int bsodDur = scan.nextInt();
        while(bsodDur <= 0){
            System.out.print("The number cannot be negative or zero! Try again:");
            bsodDur = scan.nextInt();
        }
        System.out.print("Please enter the capacity of Blue Scream of Death:");
        int bsodCap = scan.nextInt();
        while(bsodCap <= 0){
            System.out.print("The number cannot be negative or zero! Try again:");
            bsodCap = scan.nextInt();
        }
        Person[] bsodOnRide = new Person[bsodCap];
        System.out.print("Please enter the holding queue size for Blue Scream of Death:");
        int bsodSize = scan.nextInt();
        while(bsodSize <= 0){
            System.out.print("The number cannot be negative or zero! Try again:");
            bsodSize = scan.nextInt();
        }
        Ride bsod = new Ride("BSOD", bsodDur);
        int bsodTotalNum = 0;


        System.out.print("\nPlease enter the duration of Kingda Knuth (minutes):");
        int kkDur = scan.nextInt();
        while(kkDur <= 0){
            System.out.print("The number cannot be negative or zero! Try again:");
            kkDur = scan.nextInt();
        }
        System.out.print("Please enter the capacity of Kingda Knuth:");
        int kkCap = scan.nextInt();
        while(kkCap <= 0){
            System.out.print("The number cannot be negative or zero! Try again:");
            kkCap = scan.nextInt();
        }
        Person[] kkOnRide = new Person[kkCap];
        System.out.print("Please enter the holding queue size for Kingda Knuth:");
        int kkSize = scan.nextInt();
        while(kkSize <= 0){
            System.out.print("The number cannot be negative or zero! Try again:");
            kkSize = scan.nextInt();
        }
        Ride kk = new Ride("KK", kkDur);
        int kkTotalNum = 0;

        System.out.print("\nPlease enter the duration of i386 Tower of Terror (minutes):");
        int totDur = scan.nextInt();
        while(totDur <= 0){
            System.out.print("The number cannot be negative or zero! Try again:");
            totDur = scan.nextInt();
        }
        System.out.print("Please enter the capacity of i386 Tower of Terror:");
        int totCap = scan.nextInt();
        while(totCap <= 0){
            System.out.print("The number cannot be negative or zero! Try again:");
            totCap = scan.nextInt();
        }
        Person[] totOnRide = new Person[totCap];
        System.out.print("Please enter the holding queue size for i386 Tower of Terror:");
        int totSize = scan.nextInt();
        while(totSize <= 0){
            System.out.print("The number cannot be negative or zero! Try again:");
            totSize = scan.nextInt();
        }
        Ride tot = new Ride("ToT", totDur);
        int totTotalNum = 0;

        System.out.print("\nPlease enter the duration of GeForce (minutes):");
        int gfDur = scan.nextInt();
        while(gfDur <= 0){
            System.out.print("The number cannot be negative or zero! Try again:");
            gfDur = scan.nextInt();
        }
        System.out.print("Please enter the capacity of GeForce:");
        int gfCap = scan.nextInt();
        while(gfCap <= 0){
            System.out.print("The number cannot be negative or zero! Try again:");
            gfCap = scan.nextInt();
        }
        Person[] gfOnRide = new Person[gfCap];
        System.out.print("Please enter the holding queue size for GeForce:");
        int gfSize = scan.nextInt();
        while(gfSize <= 0){
            System.out.print("The number cannot be negative or zero! Try again:");
            gfSize = scan.nextInt();
        }
        Ride gf = new Ride("GF", gfDur);
        int gfTotalNum = 0;

        Ride[] rides = {bsod,kk,tot,gf};

        for(int i = 0; i < gold.length; i++){
            gold[i].setStatus(Status.Available);
            Ride r = RandomGenerator.selectRide(rides);
            r.getVirtualLine().enqueue(gold[i]);
            gold[i].setLinesIndex(0,r);
        }

        for(int i = 0; i < silver.length; i++){
            silver[i].setStatus(Status.Available);
            Ride r = RandomGenerator.selectRide(rides);
            r.getVirtualLine().enqueue(silver[i]);
            silver[i].setLinesIndex(0,r);
        }
        for(int i = 0; i < reg; i++){
            regular[i].setStatus(Status.Available);
            Ride r = RandomGenerator.selectRide(rides);
            r.getVirtualLine().enqueue(regular[i]);
            regular[i].setLinesIndex(0,r);
        }




        for(int i = 0; i < gold.length; i++){
            gold[i].setStatus(Status.Available);
            Ride r = RandomGenerator.selectRide(rides);
            r.getVirtualLine().enqueue(gold[i]);
            gold[i].setLinesIndex(1,r);
        }
        for(int i = 0; i < silver.length; i++){
            silver[i].setStatus(Status.Available);
            Ride r = RandomGenerator.selectRide(rides);
            r.getVirtualLine().enqueue(silver[i]);
            silver[i].setLinesIndex(1,r);
        }

        for(int i = 0; i < gold.length; i++){
            gold[i].setStatus(Status.Available);
            Ride r = RandomGenerator.selectRide(rides);
            r.getVirtualLine().enqueue(gold[i]);
            gold[i].setLinesIndex(2,r);
        }



        while(bsod.getVirtualLine().getLineSize() > 0 && bsod.getHoldingQueue().getLineSize() < bsodSize) {
            bsod.getHoldingQueue().enqueue(bsod.getVirtualLine().dequeue());
            bsod.getHoldingQueue().getTail().getData().setStatus(Status.Holding);
        }
        while(kk.getVirtualLine().getLineSize() > 0 && kk.getHoldingQueue().getLineSize() < kkSize) {
            kk.getHoldingQueue().enqueue(kk.getVirtualLine().dequeue());
            kk.getHoldingQueue().getTail().getData().setStatus(Status.Holding);
        }
        while(tot.getVirtualLine().getLineSize() > 0 && tot.getHoldingQueue().getLineSize() < totSize) {
            tot.getHoldingQueue().enqueue(tot.getVirtualLine().dequeue());
            tot.getHoldingQueue().getTail().getData().setStatus(Status.Holding);
        }
        while(gf.getVirtualLine().getLineSize() > 0 && gf.getHoldingQueue().getLineSize() < gfSize) {
            gf.getHoldingQueue().enqueue(gf.getVirtualLine().dequeue());
            gf.getHoldingQueue().getTail().getData().setStatus(Status.Holding);
        }






        for(int i = 0; i < bsodOnRide.length; i++){
            if(bsod.getHoldingQueue().getHead() != null){
                bsodOnRide[i] = bsod.getHoldingQueue().dequeue();
                bsodOnRide[i].setStatus(Status.OnRide);
                bsodOnRide[i].incrementNumRides();
            }
        }
        bsod.setPeopleOnRide(bsodOnRide);
        for(int i = 0; i < kkOnRide.length; i++){
            if(kk.getHoldingQueue().getHead() != null){
                kkOnRide[i] = kk.getHoldingQueue().dequeue();
                kkOnRide[i].setStatus(Status.OnRide);
                kkOnRide[i].incrementNumRides();
            }
        }
        kk.setPeopleOnRide(kkOnRide);
        for(int i = 0; i < totOnRide.length; i++){
            if(tot.getHoldingQueue().getHead() != null){
                totOnRide[i] = tot.getHoldingQueue().dequeue();
                totOnRide[i].setStatus(Status.OnRide);
                totOnRide[i].incrementNumRides();
            }
        }
        tot.setPeopleOnRide(totOnRide);
        for(int i = 0; i < gfOnRide.length; i++){
            if(gf.getHoldingQueue().getHead() != null){
                gfOnRide[i] = gf.getHoldingQueue().dequeue();
                gfOnRide[i].setStatus(Status.OnRide);
                gfOnRide[i].incrementNumRides();
            }
        }
        gf.setPeopleOnRide(gfOnRide);



        while(bsod.getVirtualLine().getLineSize() > 0 && bsod.getHoldingQueue().getLineSize() < bsodSize) {
            bsod.getHoldingQueue().enqueue(bsod.getVirtualLine().dequeue());
            bsod.getHoldingQueue().getTail().getData().setStatus(Status.Holding);
        }
        while(kk.getVirtualLine().getLineSize() > 0 && kk.getHoldingQueue().getLineSize() < kkSize) {
            kk.getHoldingQueue().enqueue(kk.getVirtualLine().dequeue());
            kk.getHoldingQueue().getTail().getData().setStatus(Status.Holding);
        }
        while(tot.getVirtualLine().getLineSize() > 0 && tot.getHoldingQueue().getLineSize() < totSize) {
            tot.getHoldingQueue().enqueue(tot.getVirtualLine().dequeue());
            tot.getHoldingQueue().getTail().getData().setStatus(Status.Holding);
        }
        while(gf.getVirtualLine().getLineSize() > 0 && gf.getHoldingQueue().getLineSize() < gfSize) {
            gf.getHoldingQueue().enqueue(gf.getVirtualLine().dequeue());
            gf.getHoldingQueue().getTail().getData().setStatus(Status.Holding);
        }


        System.out.print("\n-----------------------------------------------------------------------------");

        int temp1 = 0;
        while(temp1 <= simLength){
            System.out.print("\nAt Time " + temp1 + ":\n");

            System.out.print("\nBlue Scream of Death - Time Remaining: " + bsod.getTimeLeft() + " min");
            System.out.print("\nOn Ride: ");
            bsodOnRide = bsod.getPeopleOnRide();
            for(int i = 0; i < bsodOnRide.length; i++){
                if(bsodOnRide[i] != null) {
                    System.out.print(bsodOnRide[i].toString());
                    if (i != bsodOnRide.length - 1) {
                        System.out.print(", ");
                    }
                }
            }
            System.out.print("\nHolding Queue: ");
            bsod.getHoldingQueue().printLine();
            System.out.print("\nVirtual Queue: ");
            bsod.getVirtualLine().printLine();

            System.out.print("\n----------------");

            System.out.print("\nKingda Knuth - Time Remaining: " + kk.getTimeLeft() + " min");
            System.out.print("\nOn Ride: ");
            kkOnRide = kk.getPeopleOnRide();
            for(int i = 0; i < kkOnRide.length; i++){
                if(kkOnRide[i] != null) {
                    System.out.print(kkOnRide[i].toString());
                    if (i != kkOnRide.length - 1) {
                        System.out.print(", ");
                    }
                }
            }
            System.out.print("\nHolding Queue: ");
            kk.getHoldingQueue().printLine();
            System.out.print("\nVirtual Queue: ");
            kk.getVirtualLine().printLine();

            System.out.print("\n----------------");

            System.out.print("\ni386 Tower of Terror - Time Remaining: " + tot.getTimeLeft() + " min");
            System.out.print("\nOn Ride: ");
            totOnRide = tot.getPeopleOnRide();
            for(int i = 0; i < totOnRide.length; i++){
                if(totOnRide[i] != null) {
                    System.out.print(totOnRide[i].toString());
                    if (i != totOnRide.length - 1) {
                        System.out.print(", ");
                    }
                }
            }
            System.out.print("\nHolding Queue: ");
            tot.getHoldingQueue().printLine();
            System.out.print("\nVirtual Queue: ");
            tot.getVirtualLine().printLine();

            System.out.print("\n----------------");

            System.out.print("\nGeForce - Time Remaining: " + gf.getTimeLeft() + " min");
            System.out.print("\nOn Ride: ");
            gfOnRide = gf.getPeopleOnRide();
            for(int i = 0; i < gfOnRide.length; i++){
                if(gfOnRide[i] != null) {
                    System.out.print(gfOnRide[i].toString());
                    if (i != gfOnRide.length - 1) {
                        System.out.print(", ");
                    }
                }
            }
            System.out.print("\nHolding Queue: ");
            gf.getHoldingQueue().printLine();
            System.out.print("\nVirtual Queue: ");
            gf.getVirtualLine().printLine();

            System.out.print("\n----------------");


                System.out.print("\nRegular Customers: \n\n");
                System.out.print("Num Line Status\n");
                System.out.print("------------------\n");
                for(int i = 0; i < regular.length; i++){
                    System.out.print(regular[i].getNumber() + ".  ");
                    regular[i].printLines();
                    System.out.print(regular[i].getStatus() + "\n");
                }
            System.out.print("\n\n\nSilver Customers: \n\n");
            System.out.print("Num Line1 Line 2 Status\n");
            System.out.print("----------------------\n");
            for(int i = 0; i < silver.length; i++){
                System.out.print(silver[i].getNumber() + ".  ");
                silver[i].printLines();
                System.out.print(silver[i].getStatus() + "\n");
            }
            System.out.print("\n\n\nGold Customers: \n\n");
            System.out.print("Num Line 1 Line 2 Line 3 Status\n");
            System.out.print("----------------------------\n");
            for(int i = 0; i < gold.length; i++){
                System.out.print(gold[i].getNumber() + ".  ");
                gold[i].printLines();
                System.out.print(gold[i].getStatus() + "\n");
            }

            System.out.print("\n-----------------------------------------------------------------------------");


            temp1++;
            bsod.setTimeLeft(bsod.getTimeLeft()-1);
            if(bsod.getTimeLeft() == 0){
                bsod.setTimeLeft(bsodDur);
                for(int i = 0; i < bsodOnRide.length; i++){
                    if(bsodOnRide[i] != null) {
                        bsodOnRide[i].setStatus(Status.Available);
                        Ride r = RandomGenerator.selectRide(rides);
                        r.getVirtualLine().enqueue(bsodOnRide[i]);
                        bsodTotalNum++;
                        int location = 0;
                        for (int j = 0; j < bsodOnRide[i].getLines().length; j++) {
                            if (bsodOnRide[i].getLines()[j].equals(bsod)) {
                                location = j;
                            }
                        }
                        bsodOnRide[i].setLinesIndex(location, r);
                    }
                }
                while(bsod.getVirtualLine().getLineSize() > 0 && bsod.getHoldingQueue().getLineSize() < bsodSize) {
                    bsod.getVirtualLine().getHead().getData().setStatus(Status.Holding);
                    bsod.getHoldingQueue().enqueue(bsod.getVirtualLine().dequeue());
                }
                for(int i = 0; i < bsodOnRide.length; i++){
                    if(bsod.getHoldingQueue().getHead() != null){
                        bsodOnRide[i] = bsod.getHoldingQueue().dequeue();
                        bsodOnRide[i].setStatus(Status.OnRide);
                        bsodOnRide[i].incrementNumRides();
                    }
                }
                bsod.setPeopleOnRide(bsodOnRide);
                while(bsod.getVirtualLine().getLineSize() > 0 && bsod.getHoldingQueue().getLineSize() < bsodSize) {
                    bsod.getVirtualLine().getHead().getData().setStatus(Status.Holding);
                    bsod.getHoldingQueue().enqueue(bsod.getVirtualLine().dequeue());
                }
            }

            kk.setTimeLeft(kk.getTimeLeft()-1);
            if(kk.getTimeLeft() == 0){
                kk.setTimeLeft(kkDur);
                for(int i = 0; i < kkOnRide.length; i++) {
                    if(kkOnRide[i] != null) {
                        kkOnRide[i].setStatus(Status.Available);
                        Ride r = RandomGenerator.selectRide(rides);
                        r.getVirtualLine().enqueue(kkOnRide[i]);
                        kkTotalNum++;
                        int location = 0;
                        for (int j = 0; j < kkOnRide[i].getLines().length; j++) {
                            if (kkOnRide[i].getLines()[j].equals(kk)) {
                                location = j;
                            }
                        }
                        kkOnRide[i].setLinesIndex(location, r);
                    }
                }
                while(kk.getVirtualLine().getLineSize() > 0 && kk.getHoldingQueue().getLineSize() < kkSize) {
                    kk.getVirtualLine().getHead().getData().setStatus(Status.Holding);
                    kk.getHoldingQueue().enqueue(kk.getVirtualLine().dequeue());
                }
                for(int i = 0; i < kkOnRide.length; i++){
                    if(kk.getHoldingQueue().getHead() != null){
                        kkOnRide[i] = kk.getHoldingQueue().dequeue();
                        kkOnRide[i].setStatus(Status.OnRide);
                        kkOnRide[i].incrementNumRides();
                    }
                }
                kk.setPeopleOnRide(kkOnRide);
                while(kk.getVirtualLine().getLineSize() > 0 && kk.getHoldingQueue().getLineSize() < kkSize) {
                    kk.getVirtualLine().getHead().getData().setStatus(Status.Holding);
                    kk.getHoldingQueue().enqueue(kk.getVirtualLine().dequeue());
                }
            }

            tot.setTimeLeft(tot.getTimeLeft()-1);
            if(tot.getTimeLeft() == 0){
                tot.setTimeLeft(totDur);
                for(int i = 0; i < totOnRide.length; i++){
                    if(totOnRide[i] != null) {
                        totOnRide[i].setStatus(Status.Available);
                        Ride r = RandomGenerator.selectRide(rides);
                        r.getVirtualLine().enqueue(totOnRide[i]);
                        totTotalNum++;
                        int location = 0;
                        for (int j = 0; j < totOnRide[i].getLines().length; j++) {
                            if (totOnRide[i].getLines()[j].equals(tot)) {
                                location = j;
                            }
                        }
                        totOnRide[i].setLinesIndex(location, r);
                    }
                }
                while(tot.getVirtualLine().getLineSize() > 0 && tot.getHoldingQueue().getLineSize() < totSize) {
                    tot.getVirtualLine().getHead().getData().setStatus(Status.Holding);
                    tot.getHoldingQueue().enqueue(tot.getVirtualLine().dequeue());
                }
                for(int i = 0; i < totOnRide.length; i++){
                    if(tot.getHoldingQueue().getHead() != null){
                        totOnRide[i] = tot.getHoldingQueue().dequeue();
                        totOnRide[i].setStatus(Status.OnRide);
                        totOnRide[i].incrementNumRides();
                    }
                }
                tot.setPeopleOnRide(totOnRide);
                while(tot.getVirtualLine().getLineSize() > 0 && tot.getHoldingQueue().getLineSize() < totSize) {
                    tot.getVirtualLine().getHead().getData().setStatus(Status.Holding);
                    tot.getHoldingQueue().enqueue(tot.getVirtualLine().dequeue());
                }
            }

            gf.setTimeLeft(gf.getTimeLeft()-1);
            if(gf.getTimeLeft() == 0){
                gf.setTimeLeft(gfDur);
                for(int i = 0; i < gfOnRide.length; i++){
                    if(gfOnRide[i] != null) {
                        gfOnRide[i].setStatus(Status.Available);
                        Ride r = RandomGenerator.selectRide(rides);
                        r.getVirtualLine().enqueue(gfOnRide[i]);
                        gfTotalNum++;
                        int location = 0;
                        for (int j = 0; j < gfOnRide[i].getLines().length; j++) {
                            if (gfOnRide[i].getLines()[j].equals(gf)) {
                                location = j;
                            }
                        }
                        gfOnRide[i].setLinesIndex(location, r);
                    }
                }
                while(gf.getVirtualLine().getLineSize() > 0 && gf.getHoldingQueue().getLineSize() < gfSize) {
                    gf.getVirtualLine().getHead().getData().setStatus(Status.Holding);
                    gf.getHoldingQueue().enqueue(gf.getVirtualLine().dequeue());
                }
                for(int i = 0; i < gfOnRide.length; i++){
                    if(gf.getHoldingQueue().getHead() != null){
                        gfOnRide[i] = gf.getHoldingQueue().dequeue();
                        gfOnRide[i].setStatus(Status.OnRide);
                        gfOnRide[i].incrementNumRides();
                    }
                }
                gf.setPeopleOnRide(gfOnRide);
                while(gf.getVirtualLine().getLineSize() > 0 && gf.getHoldingQueue().getLineSize() < gfSize) {
                    gf.getVirtualLine().getHead().getData().setStatus(Status.Holding);
                    gf.getHoldingQueue().enqueue(gf.getVirtualLine().dequeue());
                }
            }

            while(bsod.getVirtualLine().getLineSize() > 0 && bsod.getHoldingQueue().getLineSize() < bsodSize) {
                bsod.getVirtualLine().getHead().getData().setStatus(Status.Holding);
                bsod.getHoldingQueue().enqueue(bsod.getVirtualLine().dequeue());
            }
            while(kk.getVirtualLine().getLineSize() > 0 && kk.getHoldingQueue().getLineSize() < kkSize) {
                kk.getVirtualLine().getHead().getData().setStatus(Status.Holding);
                kk.getHoldingQueue().enqueue(kk.getVirtualLine().dequeue());
            }
            while(tot.getVirtualLine().getLineSize() > 0 && tot.getHoldingQueue().getLineSize() < totSize) {
                tot.getVirtualLine().getHead().getData().setStatus(Status.Holding);
                tot.getHoldingQueue().enqueue(tot.getVirtualLine().dequeue());
            }
            while(gf.getVirtualLine().getLineSize() > 0 && gf.getHoldingQueue().getLineSize() < gfSize) {
                gf.getVirtualLine().getHead().getData().setStatus(Status.Holding);
                gf.getHoldingQueue().enqueue(gf.getVirtualLine().dequeue());
            }
        }
        double total = 0;
        for(int i = 0; i < gold.length; i++){
            total += gold[i].getNumRides();
        }
        System.out.print("\n\nOn average, Gold customers have taken " + (total/gold.length) + " rides.");

        total = 0;
        for(int i = 0; i < silver.length; i++){
            total += silver[i].getNumRides();
        }
        System.out.print("\nOn average, Silver customers have taken " + (total/silver.length) + " rides.");

        total = 0;
        for(int i = 0; i < regular.length; i++){
            total += regular[i].getNumRides();
        }
        System.out.print("\nOn average, Regular customers have taken " + (total/regular.length) + " rides.");

        System.out.print("\n\nBSOD has completed rides for " + bsodTotalNum + " people.");
        System.out.print("\nKK has completed rides for " + kkTotalNum + " people.");
        System.out.print("\nToT has completed rides for " + totTotalNum + " people.");
        System.out.print("\nGF has completed rides for " + gfTotalNum + " people.\n");


    }
}