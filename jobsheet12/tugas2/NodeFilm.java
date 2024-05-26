package jobsheet12.tugas2;

public class NodeFilm {
    DaftarFilm data;
    NodeFilm prev, next;

    // constructor
    NodeFilm() {

    }
    // parameter
    NodeFilm(NodeFilm prev, DaftarFilm data, NodeFilm next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }

}
