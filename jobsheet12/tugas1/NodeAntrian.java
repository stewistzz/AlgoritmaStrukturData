package jobsheet12.tugas1;

public class NodeAntrian {
    penerimaVaksin data;
    NodeAntrian prev, next;

    // constructor
    NodeAntrian() {

    }
    // parameter
    NodeAntrian(NodeAntrian prev, penerimaVaksin data, NodeAntrian next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }

}
