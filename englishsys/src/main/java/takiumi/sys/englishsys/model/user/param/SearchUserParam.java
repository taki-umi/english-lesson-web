package takiumi.sys.englishsys.model.user.param;

/**
 * ユーザー情報検索パラメータインターフェース
 */
public interface SearchUserParam {

    /**
     * ユーザーIDを取得する
     * @return ユーザーID
     */
    public int getId();

    /**
     * ユーザー名を取得する
     * @return ユーザー名
     */
    public String getName();

    /**
     * メールアドレスを取得する
     * @return メールアドレス
     */
    public String getEmail();
}
