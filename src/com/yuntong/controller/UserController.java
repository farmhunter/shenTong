package com.yuntong.controller;

import com.yuntong.common.Foundation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(Foundation.MODULE_MAPPING_ROOT + "service/user")
public class UserController {

	private static Logger logger = LogManager.getLogger(UserController.class.getName());

}
