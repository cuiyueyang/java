package asiainfo;//package com.ai.esop.test;
//
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//import com.ai.appframe2.service.ServiceFactory;
//import com.ai.common.esb.Constant.PublicInfo;
//import com.ai.common.esb.util.XmlMapTransformUtil;
//import com.ai.esop.common.OcServiceFactory;
//import com.ai.esop.inter.client.cust.sv.interfaces.ICustServCenterSV;
//import com.ai.esop.inter.server.esb.protocol.interfaces.IEsbEsopGroupCSV;
//import com.ai.esop.inter.server.esb.protocol.interfaces.IEsbEsopProtocolCSV;
//import com.ai.esop.pojo.inter.cust.bean.SQInsAccrelQueryOut;
///**
// * Created by yangfan3 on 2019/5/23.
// */
//public class TestgroupCustOper {
//    public static void main(String[] args) throws Exception{
//        Map<String, String> map = new HashMap<String,String>();
//        map.put("BUSICODE", "ESB_SO_GROUP_PROTOCOL_SAVEPAY_001");
//        String xml =
//                "<AICRMSERVICE>" +
//                        "<PUBINFO><OSBSERIALNO>b-app-q04-srv07^14208456410000000002</OSBSERIALNO>"
//                        + "<TRANSACTIONTIME>20150126000193</TRANSACTIONTIME>"
//                        + "<INTERFACEID>100000000001</INTERFACEID>"
//                        + "<INTERFACETYPE>1005</INTERFACETYPE>"
//                        + "<ACTCHNLTYPE>1600</ACTCHNLTYPE>"
//                        + "<CHNLTYPE>4</CHNLTYPE>"
//                        + "<SYSOPID>20057971</SYSOPID>"
//                        + "<SYSPWD>8323f15343239abb72885940220a4f3e</SYSPWD>"
//                        + "<OPID>10189988</OPID>"
//                        + "<MENU_ID>10000008</MENU_ID>"
//                        + "<ORGID>11</ORGID>"
//                        + "<OPCODE>sys_esbzt01</OPCODE>"
//                        + "<REGIONCODE>571</REGIONCODE>"
//                        + "<COUNTYCODE>5711</COUNTYCODE>"
//                        + "<PROVINCECODE>571</PROVINCECODE>"
//                        + "</PUBINFO>"
//                        + "     <REQUEST>"
//                        + "         <BUSICODE>ESB_SO_GROUP_PROTOCOL_SAVEPAY_001</BUSICODE>"
//                        + "         <BUSIPARAMS>"
//                        +"<BUSI_TYPE>13</BUSI_TYPE>" +
//                        "<CHANNEL_TYPE>1</CHANNEL_TYPE>" +
//                        "<REGION_ID>571</REGION_ID>" +
//                        "<OP_ID>10208042</OP_ID>" +
//                        "<IS_MAKEUP>0</IS_MAKEUP>" +
//                        "<GROUP_INFO>" +
//                        "<GROUP_NAME>证件名称准确无误测试</GROUP_NAME>" +
//                        "<GROUP_STATUS>0</GROUP_STATUS>" +
//                        "<CUST_TYPE>11</CUST_TYPE>" +
//                        "<CUST_CERT_TYPE>11</CUST_CERT_TYPE>" +
//                        "<CUST_CERT_CODE>123456789123456789</CUST_CERT_CODE>" +
//                        "<CUST_CERT_EXPIRE>20190424</CUST_CERT_EXPIRE>" +
//                        "<CUST_CERT_ADDRESS>的技术开发的</CUST_CERT_ADDRESS>" +
//                        "<LEGAL_CUST_NAME>姜俊辉</LEGAL_CUST_NAME>" +
//                        "<CONT_PHONE1>13735503100</CONT_PHONE1>" +
//                        "<DEVELOP_TYPE>1</DEVELOP_TYPE>" +
//                        "<GROUP_TYPE>1</GROUP_TYPE>" +
//                        "<GROUP_ADDRESS>浙江省@杭州市@下城区@朝晖街道@测试</GROUP_ADDRESS>" +
//                        "<NATIONALITY>86</NATIONALITY>" +
//                        "<GROUP_PROVINCE_CODE>571</GROUP_PROVINCE_CODE>" +
//                        "<GROUP_REGION_CODE>571</GROUP_REGION_CODE>" +
//                        "<GROUP_COUNTY_CODE>5711</GROUP_COUNTY_CODE>" +
//                        "<GROUP_TOWN_CODE>57101402</GROUP_TOWN_CODE>" +
//                        "<GROUP_VILLEGE_CODE>测试</GROUP_VILLEGE_CODE>" +
//                        "<CHNL_PROVINCE_CODE>571</CHNL_PROVINCE_CODE>" +
//                        "<CHNL_REGION_CODE>571</CHNL_REGION_CODE>" +
//                        "<CHNL_COUNTY_CODE>5711</CHNL_COUNTY_CODE>" +
//                        "<CHNL_AREA_CODE>0</CHNL_AREA_CODE>" +
//                        "<POST_PROVINCE_CODE>571</POST_PROVINCE_CODE>" +
//                        "<POST_REGION_CODE>571</POST_REGION_CODE>" +
//                        "<VOCATION1>11000</VOCATION1>" +
//                        "<VOCATION2>1</VOCATION2>" +
//                        "<ORGAN_TYPE>1.2</ORGAN_TYPE>" +
//                        "<CREDIT_PAY_LEVEL>0</CREDIT_PAY_LEVEL>" +
//                        "<IS_PROV_GRP_MANAGED>N</IS_PROV_GRP_MANAGED>" +
//                        "<CUST_LEVEL>5</CUST_LEVEL>" +
//                        "<GROUP_REGION_TYPE>4</GROUP_REGION_TYPE>" +
//                        "<GROUP_SIGN_TYPE>1</GROUP_SIGN_TYPE>" +
//                        "<SERVICE_GARRISON>4</SERVICE_GARRISON>" +
//                        "<STAFF_AMOUNT>23</STAFF_AMOUNT>" +
//                        "<DEV_CHNL>1</DEV_CHNL>" +
//                        "<SERV_CHNL>1</SERV_CHNL>" +
//                        "<PROD_STATUS>1</PROD_STATUS>" +
//                        "<PROD_DEV_CHNL>1</PROD_DEV_CHNL>" +
//                        "<LONGITUDE>120</LONGITUDE>" +
//                        "<LATITUDE>30</LATITUDE>" +
//                        "<MGR_ID>20027510</MGR_ID>" +
//                        "<EC_CUST_NAME>证件名称准确无误</EC_CUST_NAME>" +
//                        "<ATTACH_INFO_LIST>" +
//                        "<ATTACH_INFO>" +
//                        "<FILE_ID/>" +
//                        "<FILE_NAME/>" +
//                        "<FILE_TYPE>27</FILE_TYPE>" +
//                        "<FILE_PATH/>" +
//                        "</ATTACH_INFO>" +
//                        "<ATTACH_INFO>" +
//                        "<FILE_ID/>" +
//                        "<FILE_NAME/>" +
//                        "<FILE_TYPE>26</FILE_TYPE>" +
//                        "<FILE_PATH/>" +
//                        "</ATTACH_INFO>" +
//                        "<ATTACH_INFO>" +
//                        "<FILE_ID/>" +
//                        "<FILE_NAME/>" +
//                        "<FILE_TYPE>25</FILE_TYPE>" +
//                        "<FILE_PATH/>" +
//                        "</ATTACH_INFO>" +
//                        "<ATTACH_INFO>" +
//                        "<FILE_ID>2019042870ce0eda0af74b2285e9c78b3856e79f</FILE_ID>" +
//                        "<FILE_NAME>摇号.pdf</FILE_NAME>" +
//                        "<FILE_TYPE>24</FILE_TYPE>" +
//                        "<FILE_PATH>http://20.26.17.230:9001/s/1026/channel_manage/571/0/556452157537.pdf</FILE_PATH>" +
//                        "</ATTACH_INFO>" +
//                        "<ATTACH_INFO>" +
//                        "<FILE_ID/>" +
//                        "<FILE_NAME/>" +
//                        "<FILE_TYPE>10</FILE_TYPE>" +
//                        "<FILE_PATH/>" +
//                        "</ATTACH_INFO>" +
//                        "<ATTACH_INFO>" +
//                        "<FILE_ID/>" +
//                        "<FILE_NAME/>" +
//                        "<FILE_TYPE>6</FILE_TYPE>" +
//                        "<FILE_PATH/>" +
//                        "</ATTACH_INFO>" +
//                        "<ATTACH_INFO>" +
//                        "<FILE_ID/>" +
//                        "<FILE_NAME/>" +
//                        "<FILE_TYPE>7</FILE_TYPE>" +
//                        "<FILE_PATH/>" +
//                        "</ATTACH_INFO>" +
//                        "<ATTACH_INFO>" +
//                        "<FILE_ID>201904289eb6a53781ab4f799a05f9a687ee6796</FILE_ID>" +
//                        "<FILE_NAME>小客车申请指标.pdf</FILE_NAME>" +
//                        "<FILE_TYPE>5</FILE_TYPE>" +
//                        "<FILE_PATH>小客车申请指标1556452139887.pdf</FILE_PATH>" +
//                        "</ATTACH_INFO>" +
//                        "</ATTACH_INFO_LIST>" +
//                        "</GROUP_INFO>" +
//                        "<AUDIT_INFO/>"
//                        + "		</BUSIPARAMS>"
//                        + "     </REQUEST>"
//                        + "</AICRMSERVICE>";
//        map.put("REQUESTXML", xml);
//
//        //IEsbEsopProtocolCSV esbEsopProtocolCSV = (IEsbEsopProtocolCSV) ServiceFactory.getService(IEsbEsopProtocolCSV.class);
//        IEsbEsopGroupCSV esbEsopProtocolCSV = (IEsbEsopGroupCSV) ServiceFactory.getService(IEsbEsopGroupCSV.class);
//        Map map2 = (Map)esbEsopProtocolCSV.groupCustOper(map);
//        //ICustServCenterSV custServCenterSV = OcServiceFactory.getService(ICustServCenterSV.class);
//        //List<SQInsAccrelQueryOut> sqInsAccrelQueryOuts = custServCenterSV.getInstAccrelByBillId("e55", 1L, 1);
//
//        //String xmltoString =  map2.get(PublicInfo.RESPONSE).toString();
//        // Map xmlToMap = XmlMapTransformUtil.xml2Map(xmltoString);
//        //Map retMap = (Map)((Map) xmlToMap.get("AICRMSERVICE")).get("RESPONSE");
//
//    }
//}
