package OOPs;

public class hierarchial_Inheritance {
    public static void main(String[] args) {
        Mtech mt = new Mtech();
        mt.pressure = "low";
        System.out.println(mt.pressure);
        VIT v = new VIT();
        System.out.println(v.pressure);
        MCA mc = new MCA();
        System.out.println(mc.pressure);
    }
}

class VIT {
    int LeastInterMarks = 60;
    String pressure = "high";
}

class Btech extends VIT {

    void civil() {
        System.out.println("I am a civil engeniering student in VIT Bhipal.");
    }
}

class MCA extends VIT {
    void mca() {
        System.out.println("I am a mca student in VIT Bhopal .");
    }
}

class Mtech extends VIT {
    void mtech() {
        System.out.println("I am a mtech student in VIT Bhopal.");
    }
}

