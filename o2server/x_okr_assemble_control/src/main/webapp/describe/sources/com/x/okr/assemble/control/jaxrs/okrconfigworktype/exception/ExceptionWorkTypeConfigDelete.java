package com.x.okr.assemble.control.jaxrs.okrconfigworktype.exception;

import com.x.base.core.project.exception.PromptException;

public class ExceptionWorkTypeConfigDelete extends PromptException {

	private static final long serialVersionUID = 1859164370743532895L;

	public ExceptionWorkTypeConfigDelete( Throwable e, String id ) {
		super("系统根据ID查询指定的工作类别配置时发生异常。ID:" + id, e);
	}
}
