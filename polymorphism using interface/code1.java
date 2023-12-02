package code33;

interface features {
    void wifi();
    void camera();
}

interface extra_features extends features {
    void video_player();
}

class smart_phone implements features, extra_features {
    @Override
    public void wifi() {
        System.out.println("Use only wifi");
    }

    @Override
    public void camera() {
        System.out.println("Use only camera");
    }

    @Override
    public void video_player() {
        System.out.println("Use only video player");
    }
}

public class example {
    public static void main(String[] args) {
        features f = new smart_phone();
        f.camera();
        f.wifi();
        // f.video_player(); // Not allowed because f is of type features

        extra_features e = new smart_phone();
        e.camera();
        e.wifi();
        e.video_player(); // Allowed because e is of type extra_features
    }
}
