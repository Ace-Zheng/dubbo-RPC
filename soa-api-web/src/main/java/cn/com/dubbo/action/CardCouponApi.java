package cn.com.dubbo.action;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.com.dubbo.base.BaseController;
import cn.com.dubbo.base.Config;
import cn.com.dubbo.base.ResultBaseBean;
import cn.dubbo.facade.member.MemberFacade;
import cn.dubbo.facade.member.model.ScoreReason;
import cn.dubbo.facade.payflow.LichenFacade;
import cn.dubbo.facade.payflow.model.CardCoupon;

/**
 * @Description: 面向用户的卡券接口
 * @author Lic.Zheng
 * @date 2017-9-15 上午10:49:06
*/
@Controller
@RequestMapping("/oms")
public class CardCouponApi extends BaseController{
	
	public Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Resource
	private LichenFacade lichenFacade;
	@Resource
	private MemberFacade memberFacade;
	
	
	/**
	 * @desc Rest风格接口Demo
	 */
	@ResponseBody
	@RequestMapping(value = "get/info2/{batchId}", method = RequestMethod.GET)
	public ResultBaseBean getMyCardsCount(@PathVariable("batchId") int batchId) throws Exception{
		ResultBaseBean result = new ResultBaseBean();
		ScoreReason cardCoupon = null;
		try {
			cardCoupon = memberFacade.queryScore();
			if(cardCoupon == null){
				result.setCode(Config.CATCH);
				result.setMsg("系统异常");
				return result;
			}
		} catch (Exception e) {
			e.printStackTrace();
			result.setCode(Config.CATCH);
			result.setMsg("系统异常");
			return result;
		
		}
		result.setData(cardCoupon);
		return result;
	}
	
	/**
	 * @desc 普通接口
	 */
	@RequestMapping(value = "get/info", method = RequestMethod.GET)
	@ResponseBody
	public ResultBaseBean info(int batchId) throws Exception{
		logger.debug("begin");
		logger.error("begin");
		logger.info("begin");
		ResultBaseBean result = new ResultBaseBean();
		CardCoupon cardCoupon = null;
		try {
			cardCoupon = lichenFacade.queryInfos(157);
			if(cardCoupon == null){
				result.setCode(Config.CATCH);
				result.setMsg("系统异常");
				return result;
			}
		} catch (Exception e) {
			e.printStackTrace();
			result.setCode(Config.CATCH);
			result.setMsg("系统异常");
			return result;
		
		}
		result.setData(cardCoupon);
		return result;
	}
}
