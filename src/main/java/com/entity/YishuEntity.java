package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 艺术
 *
 * @author 
 * @email
 */
@TableName("yishu")
public class YishuEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public YishuEntity() {

	}

	public YishuEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 艺术名称
     */
    @TableField(value = "yishu_name")

    private String yishuName;


    /**
     * 艺术照片
     */
    @TableField(value = "yishu_photo")

    private String yishuPhoto;


    /**
     * 艺术视频
     */
    @TableField(value = "yishu_video")

    private String yishuVideo;


    /**
     * 艺术类型
     */
    @TableField(value = "yishu_types")

    private Integer yishuTypes;


    /**
     * 点击次数
     */
    @TableField(value = "yishu_clicknum")

    private Integer yishuClicknum;


    /**
     * 是否上架
     */
    @TableField(value = "shangxia_types")

    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */
    @TableField(value = "yishu_delete")

    private Integer yishuDelete;


    /**
     * 艺术简介
     */
    @TableField(value = "yishu_content")

    private String yishuContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：艺术名称
	 */
    public String getYishuName() {
        return yishuName;
    }


    /**
	 * 获取：艺术名称
	 */

    public void setYishuName(String yishuName) {
        this.yishuName = yishuName;
    }
    /**
	 * 设置：艺术照片
	 */
    public String getYishuPhoto() {
        return yishuPhoto;
    }


    /**
	 * 获取：艺术照片
	 */

    public void setYishuPhoto(String yishuPhoto) {
        this.yishuPhoto = yishuPhoto;
    }
    /**
	 * 设置：艺术视频
	 */
    public String getYishuVideo() {
        return yishuVideo;
    }


    /**
	 * 获取：艺术视频
	 */

    public void setYishuVideo(String yishuVideo) {
        this.yishuVideo = yishuVideo;
    }
    /**
	 * 设置：艺术类型
	 */
    public Integer getYishuTypes() {
        return yishuTypes;
    }


    /**
	 * 获取：艺术类型
	 */

    public void setYishuTypes(Integer yishuTypes) {
        this.yishuTypes = yishuTypes;
    }
    /**
	 * 设置：点击次数
	 */
    public Integer getYishuClicknum() {
        return yishuClicknum;
    }


    /**
	 * 获取：点击次数
	 */

    public void setYishuClicknum(Integer yishuClicknum) {
        this.yishuClicknum = yishuClicknum;
    }
    /**
	 * 设置：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }


    /**
	 * 获取：是否上架
	 */

    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getYishuDelete() {
        return yishuDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setYishuDelete(Integer yishuDelete) {
        this.yishuDelete = yishuDelete;
    }
    /**
	 * 设置：艺术简介
	 */
    public String getYishuContent() {
        return yishuContent;
    }


    /**
	 * 获取：艺术简介
	 */

    public void setYishuContent(String yishuContent) {
        this.yishuContent = yishuContent;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Yishu{" +
            "id=" + id +
            ", yishuName=" + yishuName +
            ", yishuPhoto=" + yishuPhoto +
            ", yishuVideo=" + yishuVideo +
            ", yishuTypes=" + yishuTypes +
            ", yishuClicknum=" + yishuClicknum +
            ", shangxiaTypes=" + shangxiaTypes +
            ", yishuDelete=" + yishuDelete +
            ", yishuContent=" + yishuContent +
            ", createTime=" + createTime +
        "}";
    }
}
