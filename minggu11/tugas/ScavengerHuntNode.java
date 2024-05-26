package minggu11.tugas;

public class ScavengerHuntNode {
    String soal, kunci;
    ScavengerHuntNode next;
    
    // Constructor
    ScavengerHuntNode()
    {

    }

    // parameter constructor
    ScavengerHuntNode(String soal, String kunci, ScavengerHuntNode berikutnya)
    {
        this.soal = soal;
        this.kunci = kunci;
        next = berikutnya;
    }
}
