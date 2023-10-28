package takiumi.sys.englishsys.repository.user;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import takiumi.sys.englishsys.model.user.User;
import takiumi.sys.englishsys.model.user.param.SearchUserParam;

/**
 * ユーザー情報リポジトリ
 */
@Mapper
public interface UserRepository {

    /**
     * ユーザー情報一覧を取得する
     * @param param 検索パラメータ
     * @return ユーザー情報一覧
     */
    public User selectUserList(@Param("param") SearchUserParam param);
}
