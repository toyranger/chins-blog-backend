package com.chins.blog.backend.security.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("sys_user_role")
public class SysUserRole {

  @TableId(value = "id", type = IdType.AUTO)
  private Long id;
  private Long sysUserId;
  private Long sysRoleId;
}
