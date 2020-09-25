package com.task.cfm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "variable2")
public class Variable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private String id;
	@Column
	private Integer rowid;
	@Column
	private String avalue;	
	@Column
	private Integer addressout;
	@Column
	private Integer addressin;
	@Column
	private String bvalue;	
	@Column
	private Integer bit_position;
	@Column
	private String buttonpath;	
	@Column
	private String code;	
	@Column
	private String decimal;	
	@Override
	public String toString() {
		return "Variable [id=" + id + ", rowid=" + rowid + ", avalue=" + avalue + ", addressout=" + addressout
				+ ", addressin=" + addressin + ", bvalue=" + bvalue + ", bit_position=" + bit_position + ", buttonpath="
				+ buttonpath + ", code=" + code + ", decimal=" + decimal + ", defaultvalue=" + defaultvalue + ", delay="
				+ delay + ", delta=" + delta + ", description=" + description + ", dimension=" + dimension
				+ ", frequency=" + frequency + ", functioncode=" + functioncode + ", grpcategory=" + grpcategory
				+ ", idgroup=" + idgroup + ", idhsvariable=" + idhsvariable + ", idvarmdl=" + idvarmdl + ", idvariable="
				+ idvariable + ", imageoff=" + imageoff + ", imageon=" + imageon + ", inserttime=" + inserttime
				+ ", isactive=" + isactive + ", iscancelled=" + iscancelled + ", ishaccp=" + ishaccp + ", islogic="
				+ islogic + ", isonchange=" + isonchange + ", lastupdate=" + lastupdate + ", length=" + length
				+ ", maximum=" + maximum + ", measureunit=" + measureunit + ", minimum=" + minimum + ", priority="
				+ priority + ", readwrite=" + readwrite + ", signed=" + signed + ", todisplay=" + todisplay + ", type="
				+ type + ", varencoding=" + varencoding + ", detail_id=" + detail_id + ", devicemodel=" + devicemodel
				+ "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Integer getRowid() {
		return rowid;
	}
	public void setRowid(Integer rowid) {
		this.rowid = rowid;
	}
	public String getAvalue() {
		return avalue;
	}
	public void setAvalue(String avalue) {
		this.avalue = avalue;
	}
	public Integer getAddressout() {
		return addressout;
	}
	public void setAddressout(Integer addressout) {
		this.addressout = addressout;
	}
	public Integer getAddressin() {
		return addressin;
	}
	public void setAddressin(Integer addressin) {
		this.addressin = addressin;
	}
	public String getBvalue() {
		return bvalue;
	}
	public void setBvalue(String bvalue) {
		this.bvalue = bvalue;
	}
	public Integer getBit_position() {
		return bit_position;
	}
	public void setBit_position(Integer bit_position) {
		this.bit_position = bit_position;
	}
	public String getButtonpath() {
		return buttonpath;
	}
	public void setButtonpath(String buttonpath) {
		this.buttonpath = buttonpath;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDecimal() {
		return decimal;
	}
	public void setDecimal(String decimal) {
		this.decimal = decimal;
	}
	public Integer getDefaultvalue() {
		return defaultvalue;
	}
	public void setDefaultvalue(Integer defaultvalue) {
		this.defaultvalue = defaultvalue;
	}
	public Integer getDelay() {
		return delay;
	}
	public void setDelay(Integer delay) {
		this.delay = delay;
	}
	public Integer getDelta() {
		return delta;
	}
	public void setDelta(Integer delta) {
		this.delta = delta;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getDimension() {
		return dimension;
	}
	public void setDimension(Integer dimension) {
		this.dimension = dimension;
	}
	public Integer getFrequency() {
		return frequency;
	}
	public void setFrequency(Integer frequency) {
		this.frequency = frequency;
	}
	public String getFunctioncode() {
		return functioncode;
	}
	public void setFunctioncode(String functioncode) {
		this.functioncode = functioncode;
	}
	public Integer getGrpcategory() {
		return grpcategory;
	}
	public void setGrpcategory(Integer grpcategory) {
		this.grpcategory = grpcategory;
	}
	public Integer getIdgroup() {
		return idgroup;
	}
	public void setIdgroup(Integer idgroup) {
		this.idgroup = idgroup;
	}
	public Integer getIdhsvariable() {
		return idhsvariable;
	}
	public void setIdhsvariable(Integer idhsvariable) {
		this.idhsvariable = idhsvariable;
	}
	public Integer getIdvarmdl() {
		return idvarmdl;
	}
	public void setIdvarmdl(Integer idvarmdl) {
		this.idvarmdl = idvarmdl;
	}
	public Integer getIdvariable() {
		return idvariable;
	}
	public void setIdvariable(Integer idvariable) {
		this.idvariable = idvariable;
	}
	public String getImageoff() {
		return imageoff;
	}
	public void setImageoff(String imageoff) {
		this.imageoff = imageoff;
	}
	public String getImageon() {
		return imageon;
	}
	public void setImageon(String imageon) {
		this.imageon = imageon;
	}
	public String getInserttime() {
		return inserttime;
	}
	public void setInserttime(String inserttime) {
		this.inserttime = inserttime;
	}
	public String getIsactive() {
		return isactive;
	}
	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}
	public String getIscancelled() {
		return iscancelled;
	}
	public void setIscancelled(String iscancelled) {
		this.iscancelled = iscancelled;
	}
	public String getIshaccp() {
		return ishaccp;
	}
	public void setIshaccp(String ishaccp) {
		this.ishaccp = ishaccp;
	}
	public String getIslogic() {
		return islogic;
	}
	public void setIslogic(String islogic) {
		this.islogic = islogic;
	}
	public String getIsonchange() {
		return isonchange;
	}
	public void setIsonchange(String isonchange) {
		this.isonchange = isonchange;
	}
	public String getLastupdate() {
		return lastupdate;
	}
	public void setLastupdate(String lastupdate) {
		this.lastupdate = lastupdate;
	}
	public Integer getLength() {
		return length;
	}
	public void setLength(Integer length) {
		this.length = length;
	}
	public String getMaximum() {
		return maximum;
	}
	public void setMaximum(String maximum) {
		this.maximum = maximum;
	}
	public String getMeasureunit() {
		return measureunit;
	}
	public void setMeasureunit(String measureunit) {
		this.measureunit = measureunit;
	}
	public String getMinimum() {
		return minimum;
	}
	public void setMinimum(String minimum) {
		this.minimum = minimum;
	}
	public Integer getPriority() {
		return priority;
	}
	public void setPriority(Integer priority) {
		this.priority = priority;
	}
	public Integer getReadwrite() {
		return readwrite;
	}
	public void setReadwrite(Integer readwrite) {
		this.readwrite = readwrite;
	}
	public String getSigned() {
		return signed;
	}
	public void setSigned(String signed) {
		this.signed = signed;
	}
	public String getTodisplay() {
		return todisplay;
	}
	public void setTodisplay(String todisplay) {
		this.todisplay = todisplay;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public String getVarencoding() {
		return varencoding;
	}
	public void setVarencoding(String varencoding) {
		this.varencoding = varencoding;
	}
	public String getDetail_id() {
		return detail_id;
	}
	public void setDetail_id(String detail_id) {
		this.detail_id = detail_id;
	}
	public String getDevicemodel() {
		return devicemodel;
	}
	public void setDevicemodel(String devicemodel) {
		this.devicemodel = devicemodel;
	}
	@Column
	private Integer defaultvalue;
	@Column
	private Integer delay;
	@Column
	private Integer delta;
	@Column
	private String description;
	@Column
	private Integer dimension;
	@Column
	private Integer frequency;
	@Column
	private String functioncode;
	@Column
	private Integer grpcategory;
	@Column
	private Integer idgroup;
	@Column
	private Integer idhsvariable;
	@Column
	private Integer idvarmdl;
	@Column
	private Integer idvariable;
	@Column
	private String imageoff;
	@Column
	private String imageon;
	@Column
	private String inserttime;
	@Column
	private String isactive;
	@Column
	private String iscancelled;
	@Column
	private String ishaccp;
	@Column
	private String islogic;
	@Column
	private String isonchange;
	@Column
	private String lastupdate;
	@Column
	private Integer length;
	@Column
	private String maximum;
	@Column
	private String measureunit;
	@Column
	private String minimum;
	@Column
	private Integer priority;
	@Column
	private Integer readwrite;
	@Column
	private String signed;
	@Column
	private String todisplay;
	@Column
	private Integer type;
	@Column
	private String varencoding;
	@Column
	private String detail_id;
	@Column
	private String devicemodel;
	
	
	
	
	
	
}
