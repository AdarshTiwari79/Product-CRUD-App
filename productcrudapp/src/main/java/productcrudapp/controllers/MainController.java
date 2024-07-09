package productcrudapp.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import productcrudapp.model.Product_Details;
import productcrudapp.services.ProductService;

@Controller
public class MainController {

	@Autowired
	private ProductService productService;

	
	@RequestMapping("/")
	public String home(Model m) {
		List<Product_Details> products = this.productService.products();
		m.addAttribute("products",products);
		m.addAttribute("title", "Home");
		return "home";
	}

	@RequestMapping("/add-product")
	public String addProduct(Model m) {
		m.addAttribute("title", "Add Product");
		return "add_product_form";
	}

	@RequestMapping(value = "/handle-product", method = RequestMethod.POST)
	public RedirectView handleProduct(@ModelAttribute Product_Details product, HttpServletRequest request) {
		this.productService.insertOrUpdate(product);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/");
		return redirectView;
	}
	
	@RequestMapping("/delete/{productId}")
	public RedirectView deleteProduct(@PathVariable("productId") int productId, HttpServletRequest request)
	{
		this.productService.delete(productId);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/");
		return redirectView;
	}
	
	@RequestMapping("/update/{productId}")
	public String updateProduct(@PathVariable("productId") int productId, Model model)
	{
		Product_Details product = this.productService.product(productId);
		model.addAttribute("title","Update Product");
		model.addAttribute("product",product);
		return "update_form";
	}

}
