package com.game.admin.eventbus.event;

/**
 * 定义事件监听器接口
 * @author huangchunjian 
 *
 * @param <E>
 * @param <R>
 */
public interface IEventListener<E extends IEvent<?>> {

	/**
	 * 触发事件
	 * @param event 事件对象
	 * @return 返回事件处理结果
	 * @throws Exception
	 */
	public void fireEvent(E event) throws Exception;
}
