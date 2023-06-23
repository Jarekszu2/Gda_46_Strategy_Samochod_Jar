package packSamochod;

import lombok.Data;

@Data
public class SilnikElektryczny implements INaped {
    public int getPoborPraduSilnika() {
        return 12;
    }

    public int getPoborPaliwaSilnika() {
        return 0;
    }

//    public int getMocSilnika() {
//        return 0;
//    }
}
