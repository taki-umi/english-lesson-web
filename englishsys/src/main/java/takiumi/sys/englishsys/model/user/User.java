package takiumi.sys.englishsys.model.user;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

/**
 * ユーザー情報ドメインクラス
 */
@Getter
@SuperBuilder
public class User {

    /** ユーザーID */
    private int id;

    /** ユーザー名 */
    private String name;

    /** メールアドレス */
    private String email;
}
