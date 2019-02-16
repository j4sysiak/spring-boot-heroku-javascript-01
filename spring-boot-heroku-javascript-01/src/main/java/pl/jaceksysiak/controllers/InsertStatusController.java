package pl.jaceksysiak.controllers;

import java.util.Date;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import pl.jaceksysiak.model.entity.StatusUpdate;
import pl.jaceksysiak.service.StatusUpdateService;

@Controller
public class InsertStatusController {
	
	private static final int NUM_STAT = 15;
	
	@Autowired
	private StatusUpdateService statusUpdateService;
	
//	@Autowired
//	private StatusUpdate statusUpdate;
	
	
	@RequestMapping(value = "/insertstatus", method={RequestMethod.POST})
	ModelAndView insertdata(ModelAndView modelAndView, BindingResult result) {
 
		Random random = new Random();
		String name="ppppppppppppppppppppp";
		Integer x=0;
		Integer y=0;
		
		modelAndView.setViewName("app.insertdata");
		
		if(!result.hasErrors()) {
			
			for (int numUsers = 0; numUsers < NUM_STAT; numUsers++) {
				
				 x=random.nextInt(name.length());
				 y=random.nextInt(name.length());
				
				StatusUpdate statusUpdate = new StatusUpdate((x+name+y), new Date());
				
				System.out.println(statusUpdate);
				
				statusUpdateService.save(statusUpdate);
			}

		}
		
		return modelAndView;
	}

}
