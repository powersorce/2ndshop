package model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

public class ProductDTO {
	String memId;
	String prodName;
	String prodPrice;
	String prodImage;
	String prodImage2;
	String prodImage3;
	String prodDetail;
	String prodBrand;
	String prodKind;
	String prodMethod;
	String prodLocation;
	String prodGuarantee;
	String prodState;
	String prodDate;
	int prodQuantity;
	String prodNum;
	String locationName;
	String locationLat;
	String locationLng;

	public String getLocationLat() {
		return locationLat;
	}
	public void setLocationLat(String locationLat) {
		this.locationLat = locationLat;
	}
	public String getLocationLng() {
		return locationLng;
	}
	public void setLocationLng(String locationLng) {
		this.locationLng = locationLng;
	}
	public String getLocationName() {
		return locationName;
	}
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	Date heartDate;
	
	public Date getHeartDate() {
		return heartDate;
	}
	public void setHeartDate(Date heartDate) {
		this.heartDate = heartDate;
	}
	public String getProdNum() {
		return prodNum;
	}
	public void setProdNum(String prodNum) {
		this.prodNum = prodNum;
	}
	public String getProdDate() {
		return prodDate;
	}
	public void setProdDate(String prodDate) {
		this.prodDate = prodDate;
	}
	public String getProdImage2() {
		return prodImage2;
	}
	public void setProdImage2(String prodImage2) {
		this.prodImage2 = prodImage2;
	}
	public String getProdImage3() {
		return prodImage3;
	}
	public void setProdImage3(String prodImage3) {
		this.prodImage3 = prodImage3;
	}
	public String getProdMethod() {
		return prodMethod;
	}
	public void setProdMethod(String prodMethod) {
		this.prodMethod = prodMethod;
	}
	public String getMemId() {
		return memId;
	}
	public void setMemId(String memId) {
		this.memId = memId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
 
	public String getProdPrice() {
		return prodPrice;
	}
	public void setProdPrice(String prodPrice) {
		this.prodPrice = prodPrice;
	}
	public String getProdImage() {
		return prodImage;
	}
	public void setProdImage(String prodImage) {
		this.prodImage = prodImage;
	}
	public String getProdDetail() {
		return prodDetail;
	}
	public void setProdDetail(String prodDetail) {
		this.prodDetail = prodDetail;
	}
	public String getProdBrand() {
		return prodBrand;
	}
	public void setProdBrand(String prodBrand) {
		this.prodBrand = prodBrand;
	}
	public String getProdKind() {
		return prodKind;
	}
	public void setProdKind(String prodKind) {
		this.prodKind = prodKind;
	}
	public String getProdLocation() {
		return prodLocation;
	}
	public void setProdLocation(String prodLocation) {
		this.prodLocation = prodLocation;
	}
	public String getProdGuarantee() {
		return prodGuarantee;
	}
	public void setProdGuarantee(String prodGuarantee) {
		this.prodGuarantee = prodGuarantee;
	}
	public String getProdState() {
		return prodState;
	}
	public void setProdState(String prodState) {
		this.prodState = prodState;
	}
	public int getProdQuantity() {
		return prodQuantity;
	}
	public void setProdQuantity(int prodQuantity) {
		this.prodQuantity = prodQuantity;
	}
	
}
