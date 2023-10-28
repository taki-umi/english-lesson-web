package takiumi.sys.englishsys.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import takiumi.sys.englishsys.model.user.User;
import takiumi.sys.englishsys.model.user.param.SearchUserParam;
import takiumi.sys.englishsys.repository.user.UserRepository;

/**
 * ユーザー情報一覧サービス
 */
@Service
public class UserListService {

    /** ユーザーリポジトリ */
    @Autowired
    private UserRepository userRepository;

    /**
     * ユーザー情報一覧を取得する
     * @return ユーザー情報一覧
     */
    public User getUserList(SearchUserParam param) {
        User user = userRepository.selectUserList(param);
        return user;
    }
}
