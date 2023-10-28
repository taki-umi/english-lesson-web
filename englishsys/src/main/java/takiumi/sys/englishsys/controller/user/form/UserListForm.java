package takiumi.sys.englishsys.controller.user.form;

import lombok.Data;
import takiumi.sys.englishsys.model.user.param.SearchUserParam;

@Data
public class UserListForm implements SearchUserParam {

    private int id;

    private String name;

    private String email;
}
