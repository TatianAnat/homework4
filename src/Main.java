public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var boxerMass1 = 78.2;
        var boxerMass2 = 82.7;
        var totalMass = boxerMass1 + boxerMass2;
        System.out.println(totalMass);
        var massDifference = boxerMass2 - boxerMass1;
        System.out.println(massDifference);

        var massRemainder = boxerMass2 % boxerMass1;
        System.out.println(massRemainder);

        var timeJob = 640;
        var timeWorker = 8;
        var totalWorker = timeJob/timeWorker;
        System.out.println("Всего работников в компании — "+totalWorker+" человек");

        totalWorker = totalWorker + 94;
        var timeJob2 = totalWorker * timeWorker;
        System.out.println("Если в компании работает " + totalWorker + " человек, то всего " + timeJob2 + " часов работы может быть поделено между сотрудниками");



    }
}