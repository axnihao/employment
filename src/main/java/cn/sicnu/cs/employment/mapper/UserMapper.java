package cn.sicnu.cs.employment.mapper;

import cn.sicnu.cs.employment.domain.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Optional;


@Mapper
public interface UserMapper extends BaseMapper<User> {

    long countByUsername(@Param("username") String username);

    long countByEmail(@Param("email") String email);

    long countByMobile(@Param("mobile") String mobile);

    Boolean findStatusByUsername(@Param("username") String username);

    Optional<User> findOptionalByUsername(@Param("username") String username);


    //Set<Role> findRolesByUserId(@Param("id") Long id);
}
