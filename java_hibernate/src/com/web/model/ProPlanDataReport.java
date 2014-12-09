package com.web.model;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
/**
 * ProPlanDataReport entity.
 * 
 * @author MyEclipse Persistence Tools
 */
public class ProPlanDataReport implements java.io.Serializable {
	// Fields
	private Long id;
	private PlanProject planProject;
	private SysOrgan sysOrgan;
	private SysVersion sysVersion;
	private SysUser sysUser;
	private Long proType;
	private String dsb1;
	private String dsb2;
	private String dsb3;
	private String dsb4;
	private String dsb5;
	private String dsb6;
	private String dsb7;
	private String dsb8;
	private String dsb9;
	private String dsb10;
	private String dsbu1;
	private String dsbu2;
	private String dsbu3;
	private String dsbu4;
	private String dsbu5;
	private String dsbu6;
	private String dsbu7;
	private String dsbu8;
	private String dsbu9;
	private String dsbu10;
	private Double data1;
	private Double data2;
	private Double data3;
	private Double data4;
	private Double data5;
	private Double data6;
	private Double data7;
	private Double data8;
	private Double data9;
	private Double data10;
	private Double datau1;
	private Double datau2;
	private Double datau3;
	private Double datau4;
	private Double datau5;
	private Double datau6;
	private Double datau7;
	private Double datau8;
	private Double datau9;
	private Double datau10;
	private Date time1;
	private Date time2;
	private Date time3;
	private Date timeu1;
	private Date timeu2;
	private Date timeu3;
	private String remark;
	private String attr1;
	private String attr2;
	private String attr3;
	private String attr4;
	private String attr5;
	private Set proDataResolveReports = new HashSet(0);
	// Constructors
	/** default constructor */
	public ProPlanDataReport() {
	}
	/** minimal constructor */
	public ProPlanDataReport(SysUser sysUser) {
		this.sysUser = sysUser;
	}
	/** full constructor */
	public ProPlanDataReport(PlanProject planProject, SysOrgan sysOrgan, SysVersion sysVersion, SysUser sysUser, Long proType, String dsb1, String dsb2, String dsb3, String dsb4, String dsb5, String dsb6, String dsb7, String dsb8, String dsb9, String dsb10, String dsbu1, String dsbu2, String dsbu3, String dsbu4, String dsbu5, String dsbu6, String dsbu7, String dsbu8, String dsbu9, String dsbu10, Double data1, Double data2, Double data3, Double data4, Double data5, Double data6, Double data7, Double data8, Double data9, Double data10, Double datau1, Double datau2, Double datau3, Double datau4, Double datau5, Double datau6, Double datau7, Double datau8, Double datau9, Double datau10, Date time1, Date time2, Date time3, Date timeu1, Date timeu2, Date timeu3, String remark, String attr1, String attr2, String attr3, String attr4, String attr5, Set proDataResolveReports) {
		this.planProject = planProject;
		this.sysOrgan = sysOrgan;
		this.sysVersion = sysVersion;
		this.sysUser = sysUser;
		this.proType = proType;
		this.dsb1 = dsb1;
		this.dsb2 = dsb2;
		this.dsb3 = dsb3;
		this.dsb4 = dsb4;
		this.dsb5 = dsb5;
		this.dsb6 = dsb6;
		this.dsb7 = dsb7;
		this.dsb8 = dsb8;
		this.dsb9 = dsb9;
		this.dsb10 = dsb10;
		this.dsbu1 = dsbu1;
		this.dsbu2 = dsbu2;
		this.dsbu3 = dsbu3;
		this.dsbu4 = dsbu4;
		this.dsbu5 = dsbu5;
		this.dsbu6 = dsbu6;
		this.dsbu7 = dsbu7;
		this.dsbu8 = dsbu8;
		this.dsbu9 = dsbu9;
		this.dsbu10 = dsbu10;
		this.data1 = data1;
		this.data2 = data2;
		this.data3 = data3;
		this.data4 = data4;
		this.data5 = data5;
		this.data6 = data6;
		this.data7 = data7;
		this.data8 = data8;
		this.data9 = data9;
		this.data10 = data10;
		this.datau1 = datau1;
		this.datau2 = datau2;
		this.datau3 = datau3;
		this.datau4 = datau4;
		this.datau5 = datau5;
		this.datau6 = datau6;
		this.datau7 = datau7;
		this.datau8 = datau8;
		this.datau9 = datau9;
		this.datau10 = datau10;
		this.time1 = time1;
		this.time2 = time2;
		this.time3 = time3;
		this.timeu1 = timeu1;
		this.timeu2 = timeu2;
		this.timeu3 = timeu3;
		this.remark = remark;
		this.attr1 = attr1;
		this.attr2 = attr2;
		this.attr3 = attr3;
		this.attr4 = attr4;
		this.attr5 = attr5;
		this.proDataResolveReports = proDataResolveReports;
	}
	// Property accessors
	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public PlanProject getPlanProject() {
		return this.planProject;
	}
	public void setPlanProject(PlanProject planProject) {
		this.planProject = planProject;
	}
	public SysOrgan getSysOrgan() {
		return this.sysOrgan;
	}
	public void setSysOrgan(SysOrgan sysOrgan) {
		this.sysOrgan = sysOrgan;
	}
	public SysVersion getSysVersion() {
		return this.sysVersion;
	}
	public void setSysVersion(SysVersion sysVersion) {
		this.sysVersion = sysVersion;
	}
	public SysUser getSysUser() {
		return this.sysUser;
	}
	public void setSysUser(SysUser sysUser) {
		this.sysUser = sysUser;
	}
	public Long getProType() {
		return this.proType;
	}
	public void setProType(Long proType) {
		this.proType = proType;
	}
	public String getDsb1() {
		return this.dsb1;
	}
	public void setDsb1(String dsb1) {
		this.dsb1 = dsb1;
	}
	public String getDsb2() {
		return this.dsb2;
	}
	public void setDsb2(String dsb2) {
		this.dsb2 = dsb2;
	}
	public String getDsb3() {
		return this.dsb3;
	}
	public void setDsb3(String dsb3) {
		this.dsb3 = dsb3;
	}
	public String getDsb4() {
		return this.dsb4;
	}
	public void setDsb4(String dsb4) {
		this.dsb4 = dsb4;
	}
	public String getDsb5() {
		return this.dsb5;
	}
	public void setDsb5(String dsb5) {
		this.dsb5 = dsb5;
	}
	public String getDsb6() {
		return this.dsb6;
	}
	public void setDsb6(String dsb6) {
		this.dsb6 = dsb6;
	}
	public String getDsb7() {
		return this.dsb7;
	}
	public void setDsb7(String dsb7) {
		this.dsb7 = dsb7;
	}
	public String getDsb8() {
		return this.dsb8;
	}
	public void setDsb8(String dsb8) {
		this.dsb8 = dsb8;
	}
	public String getDsb9() {
		return this.dsb9;
	}
	public void setDsb9(String dsb9) {
		this.dsb9 = dsb9;
	}
	public String getDsb10() {
		return this.dsb10;
	}
	public void setDsb10(String dsb10) {
		this.dsb10 = dsb10;
	}
	public String getDsbu1() {
		return this.dsbu1;
	}
	public void setDsbu1(String dsbu1) {
		this.dsbu1 = dsbu1;
	}
	public String getDsbu2() {
		return this.dsbu2;
	}
	public void setDsbu2(String dsbu2) {
		this.dsbu2 = dsbu2;
	}
	public String getDsbu3() {
		return this.dsbu3;
	}
	public void setDsbu3(String dsbu3) {
		this.dsbu3 = dsbu3;
	}
	public String getDsbu4() {
		return this.dsbu4;
	}
	public void setDsbu4(String dsbu4) {
		this.dsbu4 = dsbu4;
	}
	public String getDsbu5() {
		return this.dsbu5;
	}
	public void setDsbu5(String dsbu5) {
		this.dsbu5 = dsbu5;
	}
	public String getDsbu6() {
		return this.dsbu6;
	}
	public void setDsbu6(String dsbu6) {
		this.dsbu6 = dsbu6;
	}
	public String getDsbu7() {
		return this.dsbu7;
	}
	public void setDsbu7(String dsbu7) {
		this.dsbu7 = dsbu7;
	}
	public String getDsbu8() {
		return this.dsbu8;
	}
	public void setDsbu8(String dsbu8) {
		this.dsbu8 = dsbu8;
	}
	public String getDsbu9() {
		return this.dsbu9;
	}
	public void setDsbu9(String dsbu9) {
		this.dsbu9 = dsbu9;
	}
	public String getDsbu10() {
		return this.dsbu10;
	}
	public void setDsbu10(String dsbu10) {
		this.dsbu10 = dsbu10;
	}
	public Double getData1() {
		return this.data1;
	}
	public void setData1(Double data1) {
		this.data1 = data1;
	}
	public Double getData2() {
		return this.data2;
	}
	public void setData2(Double data2) {
		this.data2 = data2;
	}
	public Double getData3() {
		return this.data3;
	}
	public void setData3(Double data3) {
		this.data3 = data3;
	}
	public Double getData4() {
		return this.data4;
	}
	public void setData4(Double data4) {
		this.data4 = data4;
	}
	public Double getData5() {
		return this.data5;
	}
	public void setData5(Double data5) {
		this.data5 = data5;
	}
	public Double getData6() {
		return this.data6;
	}
	public void setData6(Double data6) {
		this.data6 = data6;
	}
	public Double getData7() {
		return this.data7;
	}
	public void setData7(Double data7) {
		this.data7 = data7;
	}
	public Double getData8() {
		return this.data8;
	}
	public void setData8(Double data8) {
		this.data8 = data8;
	}
	public Double getData9() {
		return this.data9;
	}
	public void setData9(Double data9) {
		this.data9 = data9;
	}
	public Double getData10() {
		return this.data10;
	}
	public void setData10(Double data10) {
		this.data10 = data10;
	}
	public Double getDatau1() {
		return this.datau1;
	}
	public void setDatau1(Double datau1) {
		this.datau1 = datau1;
	}
	public Double getDatau2() {
		return this.datau2;
	}
	public void setDatau2(Double datau2) {
		this.datau2 = datau2;
	}
	public Double getDatau3() {
		return this.datau3;
	}
	public void setDatau3(Double datau3) {
		this.datau3 = datau3;
	}
	public Double getDatau4() {
		return this.datau4;
	}
	public void setDatau4(Double datau4) {
		this.datau4 = datau4;
	}
	public Double getDatau5() {
		return this.datau5;
	}
	public void setDatau5(Double datau5) {
		this.datau5 = datau5;
	}
	public Double getDatau6() {
		return this.datau6;
	}
	public void setDatau6(Double datau6) {
		this.datau6 = datau6;
	}
	public Double getDatau7() {
		return this.datau7;
	}
	public void setDatau7(Double datau7) {
		this.datau7 = datau7;
	}
	public Double getDatau8() {
		return this.datau8;
	}
	public void setDatau8(Double datau8) {
		this.datau8 = datau8;
	}
	public Double getDatau9() {
		return this.datau9;
	}
	public void setDatau9(Double datau9) {
		this.datau9 = datau9;
	}
	public Double getDatau10() {
		return this.datau10;
	}
	public void setDatau10(Double datau10) {
		this.datau10 = datau10;
	}
	public Date getTime1() {
		return this.time1;
	}
	public void setTime1(Date time1) {
		this.time1 = time1;
	}
	public Date getTime2() {
		return this.time2;
	}
	public void setTime2(Date time2) {
		this.time2 = time2;
	}
	public Date getTime3() {
		return this.time3;
	}
	public void setTime3(Date time3) {
		this.time3 = time3;
	}
	public Date getTimeu1() {
		return this.timeu1;
	}
	public void setTimeu1(Date timeu1) {
		this.timeu1 = timeu1;
	}
	public Date getTimeu2() {
		return this.timeu2;
	}
	public void setTimeu2(Date timeu2) {
		this.timeu2 = timeu2;
	}
	public Date getTimeu3() {
		return this.timeu3;
	}
	public void setTimeu3(Date timeu3) {
		this.timeu3 = timeu3;
	}
	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getAttr1() {
		return this.attr1;
	}
	public void setAttr1(String attr1) {
		this.attr1 = attr1;
	}
	public String getAttr2() {
		return this.attr2;
	}
	public void setAttr2(String attr2) {
		this.attr2 = attr2;
	}
	public String getAttr3() {
		return this.attr3;
	}
	public void setAttr3(String attr3) {
		this.attr3 = attr3;
	}
	public String getAttr4() {
		return this.attr4;
	}
	public void setAttr4(String attr4) {
		this.attr4 = attr4;
	}
	public String getAttr5() {
		return this.attr5;
	}
	public void setAttr5(String attr5) {
		this.attr5 = attr5;
	}
	public Set getProDataResolveReports() {
		return this.proDataResolveReports;
	}
	public void setProDataResolveReports(Set proDataResolveReports) {
		this.proDataResolveReports = proDataResolveReports;
	}
}