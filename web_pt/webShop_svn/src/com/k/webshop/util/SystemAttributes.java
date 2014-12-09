package com.k.webshop.util;



public class SystemAttributes {
	//每页显示记录条数
	public static final int PAGE_MAX_NO = 16; 
	//系统标题名称
	public static String SYS_TITLE = "营销管理信息系统";
	//用户会话标识
	public static final String LOGIN_USER = "LOGIN_USER";
	public static final String USER_TYPE="USER_TYPE";//1 管理员 2 分公司  3 电厂
	//超级密码
	public static final String SUPERPASSWORD="1";
	public static final String TABLE_MEETDATA="recmana_meeting_data";
	public static final String TABLE_PRICEADJUST="recmana_elec_price_adjust";
	public static final String TABLE_GATEWAYCHECK="recmana_gateway_check";
	public static final String TABLE_RECMANAlICENCE="recmana_licence";
	public static final String TABLE_ALTERELECPRO="recmana_alter_elec_pro";
	public static final String TABLE_CONTRACT = "recmana_contract";
	public static final String TABLE_HYDROLOGY = "recmana_hydrology";
	/*报表标示
	 * */
	public static final String water_code="shuiwei";
	public static final String FDL_CODE="FDL";
	public static final String SWBMH_CODE="SWBMH";//上网标煤耗
	public static final String QMFDSBRL_CODE="QMSBRL";////期末设备容量
	public static final String ZYDLSWDJ_CODE="ZYDLSWDJ";//转移电量上网电价（含税）   2
	public static final String ZFSRFDJ_CODE="ZFSRFDJ";//支付给受让方的价格（含税）
	public static final String ZRFZFJG_CODE="ZRFZFJG";//转让方支付的价格（含税）
	public static final String DLZYZJXY_CODE="DLZYZJXY";//电量转移增加效益;
	public static final String ZYDLSWDL_CODE="ZYDLSWDL";//转移电量对应的上网电量
	
	public static final String DLZYSR_CODE="DLZYSR";//电量转移收入
	public static final String DLZYXGRF_CODE="DLZYXGRF";//电量转移相关税费
	public static final String GMZYDLZBZFFY_CODE="GMZYDLZBZFFY";//购买转移电量指标支付的费用（不含增值税）
	public static final String ZRFDLZYQDJ_CODE="ZRFDLZYQDJ";//转让方电量转移前电价（含税）
	public static final String DLZYQFDDWRLCB_CODE="DLZYQFDDWRLCB";//电量转移前发电单位燃料成本
	public static final String FDRLCB_CODE="FDRLCB";//发电单位燃料成本
	
	public static final String SWDL_CODE="SWDL";//上网电量
	public static final String LGXZKH_CODE="LGXZKH";//两个细则考核
	public static final String DF_CODE="DF";//使用于电费结算
	
	
	
	public static final String MAP_TYPE_DIKB_ORG_DTP="idkb_org_dtp";
	public static final String MAP_TYPE_DIKB_ORG_PLANT="idkb_org_plant";
	public static final String MAP_TYPE_DIKB_ORG_BRANCH="idkb_org_branch";
	public static final String MAP_TYPE_DIKB_INDEX="idkb_index";
	public static final String MAP_TYPE_DIKB_GRID="idkb_grid";
	public static final String MAP_TYPE_DIKB_ELEC_UNIT="idkb_elec_unit";
	public static final String ORG_DTP_CODE="DTP";
	public static final String INDEX_CODE_LYXS="LYXS";
	public static final String INDEX_CODE_PJLYXS="PJLYXS";
	public static final String INDEX_CODE_FDL="FDL";
	public static final String INDEX_CODE_GDBMH="GDBMH";
	public static final String INDEX_CODE_GRBMH="GRBMH";
	public static final String INDEX_CODE_ZHCYDL="ZHCYDLV";
}