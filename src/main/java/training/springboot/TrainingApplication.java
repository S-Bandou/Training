package training.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringBootにてWebサーバを起動するためのメインクラス
 * mainメソッドを実装し、SpringApplication#runメソッドを実行する
 * eclipseなどの開発環境で、このクラスを右クリック → 実行 → SpringBootアプリケーションを選択することで、Tomcatが起動してブラウザから動作確認が可能となる
 */
@SpringBootApplication
public class TrainingApplication {
    public static void main(String[] args) {
        SpringApplication.run(TrainingApplication.class, args); // 引数はそのまま渡す
    }
}
