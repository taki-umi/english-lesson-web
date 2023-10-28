package takiumi.sys.englishsys.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import takiumi.sys.englishsys.controller.user.form.UserListForm;
import takiumi.sys.englishsys.model.user.User;
import takiumi.sys.englishsys.service.UserListService;

/**
 * ユーザー一覧画面コントローラー
 */
@Controller
public class UserListController {

    /** ユーザー取得サービスフィールド */
    @Autowired
    private UserListService userListService;

    /**
     * ユーザー一覧画面のパスを取得する
     * @return ユーザー一覧画面のパス
     */
    private String getView() {
        return "user/user-list";
    }

    /**
     * ユーザー一覧画面を表示する
     * @param modelMap モデルマップ
     * @return ユーザー一覧画面
     */
    @GetMapping("/user")
    public String init(ModelMap modelMap) {
        return getView();
    }

    @GetMapping("/user/list")
    public String search(UserListForm form, ModelMap modelMap) {

        User user = userListService.getUserList(form);
        modelMap.addAttribute("user", user);

        return getView();
    }
}
