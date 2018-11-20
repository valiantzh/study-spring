package com.hzdongcheng.persistent.constant;

import com.hzdongcheng.toolkits.constant.BaseErrorCode;

public class ErrorCode extends BaseErrorCode{
    /*-1000 ~-9000*/
    public final static String ERR_MBBINDMOBILEWATERNODATA = "-1000"; // 投递员手机绑定流水记录不存在
    public final static String ERR_ADDMBBINDMOBILEWATERFAIL = "-1001"; // 插入投递员手机绑定流水失败
    public final static String ERR_MODMBBINDMOBILEWATERFAIL = "-1002"; // 修改投递员手机绑定流水失败
    public final static String ERR_DELMBBINDMOBILEWATERFAIL = "-1003"; // 删除投递员手机绑定流水失败
    public final static String ERR_QRYMBBINDMOBILEWATERFAIL = "-1004"; // 查询投递员手机绑定流水失败

    public final static String ERR_MBDEPARTMENTNODATA = "-1005"; // 运营网点信息记录不存在
    public final static String ERR_ADDMBDEPARTMENTFAIL = "-1006"; // 插入运营网点信息失败
    public final static String ERR_MODMBDEPARTMENTFAIL = "-1007"; // 修改运营网点信息失败
    public final static String ERR_DELMBDEPARTMENTFAIL = "-1008"; // 删除运营网点信息失败
    public final static String ERR_QRYMBDEPARTMENTFAIL = "-1009"; // 查询运营网点信息失败

    public final static String ERR_MBPWDSHORTMSGNODATA = "-1010"; // 客户取件密码短消息记录不存在
    public final static String ERR_ADDMBPWDSHORTMSGFAIL = "-1011"; // 插入客户取件密码短消息失败
    public final static String ERR_MODMBPWDSHORTMSGFAIL = "-1012"; // 修改客户取件密码短消息失败
    public final static String ERR_DELMBPWDSHORTMSGFAIL = "-1013"; // 删除客户取件密码短消息失败
    public final static String ERR_QRYMBPWDSHORTMSGFAIL = "-1014"; // 查询客户取件密码短消息失败

    public final static String ERR_MBWRONGPWDWATERNODATA = "-1015"; // 客户登陆密码错误流水记录不存在
    public final static String ERR_ADDMBWRONGPWDWATERFAIL = "-1016"; // 插入客户登陆密码错误流水失败
    public final static String ERR_MODMBWRONGPWDWATERFAIL = "-1017"; // 修改客户登陆密码错误流水失败
    public final static String ERR_DELMBWRONGPWDWATERFAIL = "-1018"; // 删除客户登陆密码错误流水失败
    public final static String ERR_QRYMBWRONGPWDWATERFAIL = "-1019"; // 查询客户登陆密码错误流水失败

    public final static String ERR_OPFUNCTIONNODATA = "-1020"; // 功能表记录不存在
    public final static String ERR_ADDOPFUNCTIONFAIL = "-1021"; // 插入功能表失败
    public final static String ERR_MODOPFUNCTIONFAIL = "-1022"; // 修改功能表失败
    public final static String ERR_DELOPFUNCTIONFAIL = "-1023"; // 删除功能表失败
    public final static String ERR_QRYOPFUNCTIONFAIL = "-1024"; // 查询功能表失败

    public final static String ERR_OPMENUNODATA = "-1025"; // 菜单表记录不存在
    public final static String ERR_ADDOPMENUFAIL = "-1026"; // 插入菜单表失败
    public final static String ERR_MODOPMENUFAIL = "-1027"; // 修改菜单表失败
    public final static String ERR_DELOPMENUFAIL = "-1028"; // 删除菜单表失败
    public final static String ERR_QRYOPMENUFAIL = "-1029"; // 查询菜单表失败

    public final static String ERR_OPOPERALLLIMITNODATA = "-1030"; // 操作员总体限制表记录不存在
    public final static String ERR_ADDOPOPERALLLIMITFAIL = "-1031"; // 插入操作员总体限制表失败
    public final static String ERR_MODOPOPERALLLIMITFAIL = "-1032"; // 修改操作员总体限制表失败
    public final static String ERR_DELOPOPERALLLIMITFAIL = "-1033"; // 删除操作员总体限制表失败
    public final static String ERR_QRYOPOPERALLLIMITFAIL = "-1034"; // 查询操作员总体限制表失败

    public final static String ERR_OPOPERONLINENODATA = "-1035"; // 操作员在线信息记录不存在
    public final static String ERR_ADDOPOPERONLINEFAIL = "-1036"; // 插入操作员在线信息失败
    public final static String ERR_MODOPOPERONLINEFAIL = "-1037"; // 修改操作员在线信息失败
    public final static String ERR_DELOPOPERONLINEFAIL = "-1038"; // 删除操作员在线信息失败
    public final static String ERR_QRYOPOPERONLINEFAIL = "-1039"; // 查询操作员在线信息失败

    public final static String ERR_OPOPERROLENODATA = "-1040"; // 操作员角色记录不存在
    public final static String ERR_ADDOPOPERROLEFAIL = "-1041"; // 插入操作员角色失败
    public final static String ERR_MODOPOPERROLEFAIL = "-1042"; // 修改操作员角色失败
    public final static String ERR_DELOPOPERROLEFAIL = "-1043"; // 删除操作员角色失败
    public final static String ERR_QRYOPOPERROLEFAIL = "-1044"; // 查询操作员角色失败

    public final static String ERR_OPOPERSPERIGHTNODATA = "-1045"; // 操作员的特殊权限表记录不存在
    public final static String ERR_ADDOPOPERSPERIGHTFAIL = "-1046"; // 插入操作员的特殊权限表失败
    public final static String ERR_MODOPOPERSPERIGHTFAIL = "-1047"; // 修改操作员的特殊权限表失败
    public final static String ERR_DELOPOPERSPERIGHTFAIL = "-1048"; // 删除操作员的特殊权限表失败
    public final static String ERR_QRYOPOPERSPERIGHTFAIL = "-1049"; // 查询操作员的特殊权限表失败

    public final static String ERR_OPOPERTOMENUNODATA = "-1050"; // 操作员菜单表记录不存在
    public final static String ERR_ADDOPOPERTOMENUFAIL = "-1051"; // 插入操作员菜单表失败
    public final static String ERR_MODOPOPERTOMENUFAIL = "-1052"; // 修改操作员菜单表失败
    public final static String ERR_DELOPOPERTOMENUFAIL = "-1053"; // 删除操作员菜单表失败
    public final static String ERR_QRYOPOPERTOMENUFAIL = "-1054"; // 查询操作员菜单表失败

    public final static String ERR_OPOPERATORNODATA = "-1055"; // 操作员信息记录不存在
    public final static String ERR_ADDOPOPERATORFAIL = "-1056"; // 插入操作员信息失败
    public final static String ERR_MODOPOPERATORFAIL = "-1057"; // 修改操作员信息失败
    public final static String ERR_DELOPOPERATORFAIL = "-1058"; // 删除操作员信息失败
    public final static String ERR_QRYOPOPERATORFAIL = "-1059"; // 查询操作员信息失败

    public final static String ERR_OPOPERATORLOGNODATA = "-1060"; // 操作日志记录不存在
    public final static String ERR_ADDOPOPERATORLOGFAIL = "-1061"; // 插入操作日志失败
    public final static String ERR_MODOPOPERATORLOGFAIL = "-1062"; // 修改操作日志失败
    public final static String ERR_DELOPOPERATORLOGFAIL = "-1063"; // 删除操作日志失败
    public final static String ERR_QRYOPOPERATORLOGFAIL = "-1064"; // 查询操作日志失败

    public final static String ERR_OPROLENODATA = "-1065"; // 角色信息记录不存在
    public final static String ERR_ADDOPROLEFAIL = "-1066"; // 插入角色信息失败
    public final static String ERR_MODOPROLEFAIL = "-1067"; // 修改角色信息失败
    public final static String ERR_DELOPROLEFAIL = "-1068"; // 删除角色信息失败
    public final static String ERR_QRYOPROLEFAIL = "-1069"; // 查询角色信息失败

    public final static String ERR_OPROLEALLLIMITNODATA = "-1070"; // 角色总体限制表记录不存在
    public final static String ERR_ADDOPROLEALLLIMITFAIL = "-1071"; // 插入角色总体限制表失败
    public final static String ERR_MODOPROLEALLLIMITFAIL = "-1072"; // 修改角色总体限制表失败
    public final static String ERR_DELOPROLEALLLIMITFAIL = "-1073"; // 删除角色总体限制表失败
    public final static String ERR_QRYOPROLEALLLIMITFAIL = "-1074"; // 查询角色总体限制表失败

    public final static String ERR_OPROLESPERIGHTNODATA = "-1075"; // 角色特殊权限表记录不存在
    public final static String ERR_ADDOPROLESPERIGHTFAIL = "-1076"; // 插入角色特殊权限表失败
    public final static String ERR_MODOPROLESPERIGHTFAIL = "-1077"; // 修改角色特殊权限表失败
    public final static String ERR_DELOPROLESPERIGHTFAIL = "-1078"; // 删除角色特殊权限表失败
    public final static String ERR_QRYOPROLESPERIGHTFAIL = "-1079"; // 查询角色特殊权限表失败

    public final static String ERR_OPROLETOMENUNODATA = "-1080"; // 角色菜单表记录不存在
    public final static String ERR_ADDOPROLETOMENUFAIL = "-1081"; // 插入角色菜单表失败
    public final static String ERR_MODOPROLETOMENUFAIL = "-1082"; // 修改角色菜单表失败
    public final static String ERR_DELOPROLETOMENUFAIL = "-1083"; // 删除角色菜单表失败
    public final static String ERR_QRYOPROLETOMENUFAIL = "-1084"; // 查询角色菜单表失败

    public final static String ERR_OPSPECIALPRIVNODATA = "-1085"; // 特殊权限信息表记录不存在
    public final static String ERR_ADDOPSPECIALPRIVFAIL = "-1086"; // 插入特殊权限信息表失败
    public final static String ERR_MODOPSPECIALPRIVFAIL = "-1087"; // 修改特殊权限信息表失败
    public final static String ERR_DELOPSPECIALPRIVFAIL = "-1088"; // 删除特殊权限信息表失败
    public final static String ERR_QRYOPSPECIALPRIVFAIL = "-1089"; // 查询特殊权限信息表失败

    public final static String ERR_PACONTROLPARAMNODATA = "-1090"; // 系统控制参数记录不存在
    public final static String ERR_ADDPACONTROLPARAMFAIL = "-1091"; // 插入系统控制参数失败
    public final static String ERR_MODPACONTROLPARAMFAIL = "-1092"; // 修改系统控制参数失败
    public final static String ERR_DELPACONTROLPARAMFAIL = "-1093"; // 删除系统控制参数失败
    public final static String ERR_QRYPACONTROLPARAMFAIL = "-1094"; // 查询系统控制参数失败

    public final static String ERR_PADICTIONARYNODATA = "-1095"; // 系统字典表记录不存在
    public final static String ERR_ADDPADICTIONARYFAIL = "-1096"; // 插入系统字典表失败
    public final static String ERR_MODPADICTIONARYFAIL = "-1097"; // 修改系统字典表失败
    public final static String ERR_DELPADICTIONARYFAIL = "-1098"; // 删除系统字典表失败
    public final static String ERR_QRYPADICTIONARYFAIL = "-1099"; // 查询系统字典表失败

    public final static String ERR_PASEQUENCENODATA = "-1100"; // 序列号记录不存在
    public final static String ERR_ADDPASEQUENCEFAIL = "-1101"; // 插入序列号失败
    public final static String ERR_MODPASEQUENCEFAIL = "-1102"; // 修改序列号失败
    public final static String ERR_DELPASEQUENCEFAIL = "-1103"; // 删除序列号失败
    public final static String ERR_QRYPASEQUENCEFAIL = "-1104"; // 查询序列号失败

    public final static String ERR_PATERMINALCTRLPARAMNODATA = "-1105"; // 设备端控制参数记录不存在
    public final static String ERR_ADDPATERMINALCTRLPARAMFAIL = "-1106"; // 插入设备端控制参数失败
    public final static String ERR_MODPATERMINALCTRLPARAMFAIL = "-1107"; // 修改设备端控制参数失败
    public final static String ERR_DELPATERMINALCTRLPARAMFAIL = "-1108"; // 删除设备端控制参数失败
    public final static String ERR_QRYPATERMINALCTRLPARAMFAIL = "-1109"; // 查询设备端控制参数失败

    public final static String ERR_PMCOMPANYNODATA = "-1110"; // 投递公司记录不存在
    public final static String ERR_ADDPMCOMPANYFAIL = "-1111"; // 插入投递公司失败
    public final static String ERR_MODPMCOMPANYFAIL = "-1112"; // 修改投递公司失败
    public final static String ERR_DELPMCOMPANYFAIL = "-1113"; // 删除投递公司失败
    public final static String ERR_QRYPMCOMPANYFAIL = "-1114"; // 查询投递公司失败

    public final static String ERR_PMCORPBOXRIGHTNODATA = "-1115"; // 投递公司格口权限记录不存在
    public final static String ERR_ADDPMCORPBOXRIGHTFAIL = "-1116"; // 插入投递公司格口权限失败
    public final static String ERR_MODPMCORPBOXRIGHTFAIL = "-1117"; // 修改投递公司格口权限失败
    public final static String ERR_DELPMCORPBOXRIGHTFAIL = "-1118"; // 删除投递公司格口权限失败
    public final static String ERR_QRYPMCORPBOXRIGHTFAIL = "-1119"; // 查询投递公司格口权限失败

    public final static String ERR_PMCORPTERMINALRIGHTNODATA = "-1120"; // 投递公司柜体权限记录不存在
    public final static String ERR_ADDPMCORPTERMINALRIGHTFAIL = "-1121"; // 插入投递公司柜体权限失败
    public final static String ERR_MODPMCORPTERMINALRIGHTFAIL = "-1122"; // 修改投递公司柜体权限失败
    public final static String ERR_DELPMCORPTERMINALRIGHTFAIL = "-1123"; // 删除投递公司柜体权限失败
    public final static String ERR_QRYPMCORPTERMINALRIGHTFAIL = "-1124"; // 查询投递公司柜体权限失败

    public final static String ERR_PMMANTERMINALRIGHTNODATA = "-1125"; // 投递员柜体权限记录不存在
    public final static String ERR_ADDPMMANTERMINALRIGHTFAIL = "-1126"; // 插入投递员柜体权限失败
    public final static String ERR_MODPMMANTERMINALRIGHTFAIL = "-1127"; // 修改投递员柜体权限失败
    public final static String ERR_DELPMMANTERMINALRIGHTFAIL = "-1128"; // 删除投递员柜体权限失败
    public final static String ERR_QRYPMMANTERMINALRIGHTFAIL = "-1129"; // 查询投递员柜体权限失败

    public final static String ERR_PMPOSTMANNODATA = "-1130"; // 投递员信息表记录不存在
    public final static String ERR_ADDPMPOSTMANFAIL = "-1131"; // 插入投递员信息表失败
    public final static String ERR_MODPMPOSTMANFAIL = "-1132"; // 修改投递员信息表失败
    public final static String ERR_DELPMPOSTMANFAIL = "-1133"; // 删除投递员信息表失败
    public final static String ERR_QRYPMPOSTMANFAIL = "-1134"; // 查询投递员信息表失败

    public final static String ERR_PMPOSTMANBOXRIGHTNODATA = "-1135"; // 投递员格口权限表记录不存在
    public final static String ERR_ADDPMPOSTMANBOXRIGHTFAIL = "-1136"; // 插入投递员格口权限表失败
    public final static String ERR_MODPMPOSTMANBOXRIGHTFAIL = "-1137"; // 修改投递员格口权限表失败
    public final static String ERR_DELPMPOSTMANBOXRIGHTFAIL = "-1138"; // 删除投递员格口权限表失败
    public final static String ERR_QRYPMPOSTMANBOXRIGHTFAIL = "-1139"; // 查询投递员格口权限表失败

    public final static String ERR_PTDELIVERHISTORYNODATA = "-1140"; // 投递记录记录不存在
    public final static String ERR_ADDPTDELIVERHISTORYFAIL = "-1141"; // 插入投递记录失败
    public final static String ERR_MODPTDELIVERHISTORYFAIL = "-1142"; // 修改投递记录失败
    public final static String ERR_DELPTDELIVERHISTORYFAIL = "-1143"; // 删除投递记录失败
    public final static String ERR_QRYPTDELIVERHISTORYFAIL = "-1144"; // 查询投递记录失败

    public final static String ERR_PTINBOXPACKAGENODATA = "-1145"; // 在箱包裹信息记录不存在
    public final static String ERR_ADDPTINBOXPACKAGEFAIL = "-1146"; // 插入在箱包裹信息失败
    public final static String ERR_MODPTINBOXPACKAGEFAIL = "-1147"; // 修改在箱包裹信息失败
    public final static String ERR_DELPTINBOXPACKAGEFAIL = "-1148"; // 删除在箱包裹信息失败
    public final static String ERR_QRYPTINBOXPACKAGEFAIL = "-1149"; // 查询在箱包裹信息失败

    public final static String ERR_PTREADYPACKAGENODATA = "-1150"; // 待投递包裹记录不存在
    public final static String ERR_ADDPTREADYPACKAGEFAIL = "-1151"; // 插入待投递包裹失败
    public final static String ERR_MODPTREADYPACKAGEFAIL = "-1152"; // 修改待投递包裹失败
    public final static String ERR_DELPTREADYPACKAGEFAIL = "-1153"; // 删除待投递包裹失败
    public final static String ERR_QRYPTREADYPACKAGEFAIL = "-1154"; // 查询待投递包裹失败

    public final static String ERR_PYPACKAGEPAYNODATA = "-1155"; // 包裹支付信息记录不存在
    public final static String ERR_ADDPYPACKAGEPAYFAIL = "-1156"; // 插入包裹支付信息失败
    public final static String ERR_MODPYPACKAGEPAYFAIL = "-1157"; // 修改包裹支付信息失败
    public final static String ERR_DELPYPACKAGEPAYFAIL = "-1158"; // 删除包裹支付信息失败
    public final static String ERR_QRYPYPACKAGEPAYFAIL = "-1159"; // 查询包裹支付信息失败

    public final static String ERR_PYSUPPLYREGISTERNODATA = "-1160"; // 补充登记信息记录不存在
    public final static String ERR_ADDPYSUPPLYREGISTERFAIL = "-1161"; // 插入补充登记信息失败
    public final static String ERR_MODPYSUPPLYREGISTERFAIL = "-1162"; // 修改补充登记信息失败
    public final static String ERR_DELPYSUPPLYREGISTERFAIL = "-1163"; // 删除补充登记信息失败
    public final static String ERR_QRYPYSUPPLYREGISTERFAIL = "-1164"; // 查询补充登记信息失败

    public final static String ERR_SCPUSHDATAQUEUENODATA = "-1165"; // 推送数据队列记录不存在
    public final static String ERR_ADDSCPUSHDATAQUEUEFAIL = "-1166"; // 插入推送数据队列失败
    public final static String ERR_MODSCPUSHDATAQUEUEFAIL = "-1167"; // 修改推送数据队列失败
    public final static String ERR_DELSCPUSHDATAQUEUEFAIL = "-1168"; // 删除推送数据队列失败
    public final static String ERR_QRYSCPUSHDATAQUEUEFAIL = "-1169"; // 查询推送数据队列失败

    public final static String ERR_SCSYNCFAILWATERNODATA = "-1170"; // 同步数据失败流水记录不存在
    public final static String ERR_ADDSCSYNCFAILWATERFAIL = "-1171"; // 插入同步数据失败流水失败
    public final static String ERR_MODSCSYNCFAILWATERFAIL = "-1172"; // 修改同步数据失败流水失败
    public final static String ERR_DELSCSYNCFAILWATERFAIL = "-1173"; // 删除同步数据失败流水失败
    public final static String ERR_QRYSCSYNCFAILWATERFAIL = "-1174"; // 查询同步数据失败流水失败

    public final static String ERR_SCTIMESTAMPNODATA = "-1175"; // 数据同步时间戳记录不存在
    public final static String ERR_ADDSCTIMESTAMPFAIL = "-1176"; // 插入数据同步时间戳失败
    public final static String ERR_MODSCTIMESTAMPFAIL = "-1177"; // 修改数据同步时间戳失败
    public final static String ERR_DELSCTIMESTAMPFAIL = "-1178"; // 删除数据同步时间戳失败
    public final static String ERR_QRYSCTIMESTAMPFAIL = "-1179"; // 查询数据同步时间戳失败

    public final static String ERR_SCUPLOADDATAQUEUENODATA = "-1180"; // 上传数据队列记录不存在
    public final static String ERR_ADDSCUPLOADDATAQUEUEFAIL = "-1181"; // 插入上传数据队列失败
    public final static String ERR_MODSCUPLOADDATAQUEUEFAIL = "-1182"; // 修改上传数据队列失败
    public final static String ERR_DELSCUPLOADDATAQUEUEFAIL = "-1183"; // 删除上传数据队列失败
    public final static String ERR_QRYSCUPLOADDATAQUEUEFAIL = "-1184"; // 查询上传数据队列失败

    public final static String ERR_SMADVIDEONODATA = "-1185"; // 广告视频表记录不存在
    public final static String ERR_ADDSMADVIDEOFAIL = "-1186"; // 插入广告视频表失败
    public final static String ERR_MODSMADVIDEOFAIL = "-1187"; // 修改广告视频表失败
    public final static String ERR_DELSMADVIDEOFAIL = "-1188"; // 删除广告视频表失败
    public final static String ERR_QRYSMADVIDEOFAIL = "-1189"; // 查询广告视频表失败

    public final static String ERR_SMSYSTEMINFONODATA = "-1190"; // 系统信息表记录不存在
    public final static String ERR_ADDSMSYSTEMINFOFAIL = "-1191"; // 插入系统信息表失败
    public final static String ERR_MODSMSYSTEMINFOFAIL = "-1192"; // 修改系统信息表失败
    public final static String ERR_DELSMSYSTEMINFOFAIL = "-1193"; // 删除系统信息表失败
    public final static String ERR_QRYSMSYSTEMINFOFAIL = "-1194"; // 查询系统信息表失败

    public final static String ERR_TBBOXNODATA = "-1195"; // 箱信息表记录不存在
    public final static String ERR_ADDTBBOXFAIL = "-1196"; // 插入箱信息表失败
    public final static String ERR_MODTBBOXFAIL = "-1197"; // 修改箱信息表失败
    public final static String ERR_DELTBBOXFAIL = "-1198"; // 删除箱信息表失败
    public final static String ERR_QRYTBBOXFAIL = "-1199"; // 查询箱信息表失败

    public final static String ERR_TBBOXSTATUSLOGNODATA = "-1200"; // 箱状态报告日志记录不存在
    public final static String ERR_ADDTBBOXSTATUSLOGFAIL = "-1201"; // 插入箱状态报告日志失败
    public final static String ERR_MODTBBOXSTATUSLOGFAIL = "-1202"; // 修改箱状态报告日志失败
    public final static String ERR_DELTBBOXSTATUSLOGFAIL = "-1203"; // 删除箱状态报告日志失败
    public final static String ERR_QRYTBBOXSTATUSLOGFAIL = "-1204"; // 查询箱状态报告日志失败

    public final static String ERR_TBBOXTYPENODATA = "-1205"; // 箱类型信息表记录不存在
    public final static String ERR_ADDTBBOXTYPEFAIL = "-1206"; // 插入箱类型信息表失败
    public final static String ERR_MODTBBOXTYPEFAIL = "-1207"; // 修改箱类型信息表失败
    public final static String ERR_DELTBBOXTYPEFAIL = "-1208"; // 删除箱类型信息表失败
    public final static String ERR_QRYTBBOXTYPEFAIL = "-1209"; // 查询箱类型信息表失败

    public final static String ERR_TBDESKNODATA = "-1210"; // 扩展柜信息记录不存在
    public final static String ERR_ADDTBDESKFAIL = "-1211"; // 插入扩展柜信息失败
    public final static String ERR_MODTBDESKFAIL = "-1212"; // 修改扩展柜信息失败
    public final static String ERR_DELTBDESKFAIL = "-1213"; // 删除扩展柜信息失败
    public final static String ERR_QRYTBDESKFAIL = "-1214"; // 查询扩展柜信息失败

    public final static String ERR_TBSIGNINFONODATA = "-1215"; // 设备签到信息记录不存在
    public final static String ERR_ADDTBSIGNINFOFAIL = "-1216"; // 插入设备签到信息失败
    public final static String ERR_MODTBSIGNINFOFAIL = "-1217"; // 修改设备签到信息失败
    public final static String ERR_DELTBSIGNINFOFAIL = "-1218"; // 删除设备签到信息失败
    public final static String ERR_QRYTBSIGNINFOFAIL = "-1219"; // 查询设备签到信息失败

    public final static String ERR_TBTERMINALNODATA = "-1220"; // 柜信息表记录不存在
    public final static String ERR_ADDTBTERMINALFAIL = "-1221"; // 插入柜信息表失败
    public final static String ERR_MODTBTERMINALFAIL = "-1222"; // 修改柜信息表失败
    public final static String ERR_DELTBTERMINALFAIL = "-1223"; // 删除柜信息表失败
    public final static String ERR_QRYTBTERMINALFAIL = "-1224"; // 查询柜信息表失败

    public final static String ERR_TBTERMINALALERTLOGNODATA = "-1225"; // 设备终端报警日志记录不存在
    public final static String ERR_ADDTBTERMINALALERTLOGFAIL = "-1226"; // 插入设备终端报警日志失败
    public final static String ERR_MODTBTERMINALALERTLOGFAIL = "-1227"; // 修改设备终端报警日志失败
    public final static String ERR_DELTBTERMINALALERTLOGFAIL = "-1228"; // 删除设备终端报警日志失败
    public final static String ERR_QRYTBTERMINALALERTLOGFAIL = "-1229"; // 查询设备终端报警日志失败

    public final static String ERR_TBTERMINALSTATUSLOGNODATA = "-1230"; // 柜状态报告日志记录不存在
    public final static String ERR_ADDTBTERMINALSTATUSLOGFAIL = "-1231"; // 插入柜状态报告日志失败
    public final static String ERR_MODTBTERMINALSTATUSLOGFAIL = "-1232"; // 修改柜状态报告日志失败
    public final static String ERR_DELTBTERMINALSTATUSLOGFAIL = "-1233"; // 删除柜状态报告日志失败
    public final static String ERR_QRYTBTERMINALSTATUSLOGFAIL = "-1234"; // 查询柜状态报告日志失败

    public final static String ERR_MBBOXSTATUSLOGNODATA = "-1235"; // 箱状态报告记录不存在
    public final static String ERR_ADDMBBOXSTATUSLOGFAIL = "-1236"; // 插入箱状态报告失败
    public final static String ERR_MODMBBOXSTATUSLOGFAIL = "-1237"; // 修改箱状态报告失败
    public final static String ERR_DELMBBOXSTATUSLOGFAIL = "-1238"; // 删除箱状态报告失败
    public final static String ERR_QRYMBBOXSTATUSLOGFAIL = "-1239"; // 查询箱状态报告失败

    public final static String ERR_MBSIGNINFONODATA = "-1240"; // 设备签到信息记录不存在
    public final static String ERR_ADDMBSIGNINFOFAIL = "-1241"; // 插入设备签到信息失败
    public final static String ERR_MODMBSIGNINFOFAIL = "-1242"; // 修改设备签到信息失败
    public final static String ERR_DELMBSIGNINFOFAIL = "-1243"; // 删除设备签到信息失败
    public final static String ERR_QRYMBSIGNINFOFAIL = "-1244"; // 查询设备签到信息失败

    public final static String ERR_MBTERMINALALERTLOGNODATA = "-1245"; // 设备终端报警日志记录不存在
    public final static String ERR_ADDMBTERMINALALERTLOGFAIL = "-1246"; // 插入设备终端报警日志失败
    public final static String ERR_MODMBTERMINALALERTLOGFAIL = "-1247"; // 修改设备终端报警日志失败
    public final static String ERR_DELMBTERMINALALERTLOGFAIL = "-1248"; // 删除设备终端报警日志失败
    public final static String ERR_QRYMBTERMINALALERTLOGFAIL = "-1249"; // 查询设备终端报警日志失败

    public final static String ERR_MBTERMINALSTATUSLOGNODATA = "-1250"; // 柜状态报告记录不存在
    public final static String ERR_ADDMBTERMINALSTATUSLOGFAIL = "-1251"; // 插入柜状态报告失败
    public final static String ERR_MODMBTERMINALSTATUSLOGFAIL = "-1252"; // 修改柜状态报告失败
    public final static String ERR_DELMBTERMINALSTATUSLOGFAIL = "-1253"; // 删除柜状态报告失败
    public final static String ERR_QRYMBTERMINALSTATUSLOGFAIL = "-1254"; // 查询柜状态报告失败

    public final static String ERR_TBSERVERBOXNODATA = "-1255"; //运营端箱信息表记录不存在
    public final static String ERR_ADDTBSERVERBOXFAIL = "-1256"; //插入运营端箱信息表失败
    public final static String ERR_MODTBSERVERBOXFAIL = "-1257"; //修改运营端箱信息表失败
    public final static String ERR_DELTBSERVERBOXFAIL = "-1258"; //删除运营端箱信息表失败
    public final static String ERR_QRYTBSERVERBOXFAIL = "-1259"; //查询运营端箱信息表失败

    public final static String ERR_TBSERVERDESKNODATA = "-1260"; //运行端扩展柜信息记录不存在
    public final static String ERR_ADDTBSERVERDESKFAIL = "-1261"; //插入运行端扩展柜信息失败
    public final static String ERR_MODTBSERVERDESKFAIL = "-1262"; //修改运行端扩展柜信息失败
    public final static String ERR_DELTBSERVERDESKFAIL = "-1263"; //删除运行端扩展柜信息失败
    public final static String ERR_QRYTBSERVERDESKFAIL = "-1264"; //查询运行端扩展柜信息失败

    public final static String ERR_MBLOCKUSERTIMENODATA = "-1265"; //客户取件密码错误锁定时间表记录不存在
    public final static String ERR_ADDMBLOCKUSERTIMEFAIL = "-1266"; //插入客户取件密码错误锁定时间表失败
    public final static String ERR_MODMBLOCKUSERTIMEFAIL = "-1267"; //修改客户取件密码错误锁定时间表失败
    public final static String ERR_DELMBLOCKUSERTIMEFAIL = "-1268"; //删除客户取件密码错误锁定时间表失败
    public final static String ERR_QRYMBLOCKUSERTIMEFAIL = "-1269"; //查询客户取件密码错误锁定时间表失败

    public final static String ERR_SCFTPLOGNODATA = "-1270"; //FTP同步日志记录不存在
    public final static String ERR_ADDSCFTPLOGFAIL = "-1271"; //插入FTP同步日志失败
    public final static String ERR_MODSCFTPLOGFAIL = "-1272"; //修改FTP同步日志失败
    public final static String ERR_DELSCFTPLOGFAIL = "-1273"; //删除FTP同步日志失败
    public final static String ERR_QRYSCFTPLOGFAIL = "-1274"; //查询FTP同步日志失败

    public final static String ERR_RMAPPEALLOGNODATA = "-1275"; //远程求助日志记录不存在
    public final static String ERR_ADDRMAPPEALLOGFAIL = "-1276"; //插入远程求助日志失败
    public final static String ERR_MODRMAPPEALLOGFAIL = "-1277"; //修改远程求助日志失败
    public final static String ERR_DELRMAPPEALLOGFAIL = "-1278"; //删除远程求助日志失败
    public final static String ERR_QRYRMAPPEALLOGFAIL = "-1279"; //查询远程求助日志失败

    public final static String ERR_RMOPENBOXLOGNODATA = "-1280"; //开箱记录记录不存在
    public final static String ERR_ADDRMOPENBOXLOGFAIL = "-1281"; //插入开箱记录失败
    public final static String ERR_MODRMOPENBOXLOGFAIL = "-1282"; //修改开箱记录失败
    public final static String ERR_DELRMOPENBOXLOGFAIL = "-1283"; //删除开箱记录失败
    public final static String ERR_QRYRMOPENBOXLOGFAIL = "-1284"; //查询开箱记录失败
    
    public final static String ERR_MBMOBILEBLACKLISTNODATA = "-1300"; //手机黑名单记录不存在
    public final static String ERR_ADDMBMOBILEBLACKLISTFAIL = "-1301"; //插入手机黑名单失败
    public final static String ERR_MODMBMOBILEBLACKLISTFAIL = "-1302"; //修改手机黑名单失败
    public final static String ERR_DELMBMOBILEBLACKLISTFAIL = "-1303"; //删除手机黑名单失败
    public final static String ERR_QRYMBMOBILEBLACKLISTFAIL = "-1304"; //查询手机黑名单失败

    public final static String ERR_MBREMINDERWATERNODATA = "-1305"; //包裹催领流水记录不存在
    public final static String ERR_ADDMBREMINDERWATERFAIL = "-1306"; //插入包裹催领流水失败
    public final static String ERR_MODMBREMINDERWATERFAIL = "-1307"; //修改包裹催领流水失败
    public final static String ERR_DELMBREMINDERWATERFAIL = "-1308"; //删除包裹催领流水失败
    public final static String ERR_QRYMBREMINDERWATERFAIL = "-1309"; //查询包裹催领流水失败

    public final static String ERR_PMLOGISTICSNODATA = "-1310"; //物流公司记录不存在
    public final static String ERR_ADDPMLOGISTICSFAIL = "-1311"; //插入物流公司失败
    public final static String ERR_MODPMLOGISTICSFAIL = "-1312"; //修改物流公司失败
    public final static String ERR_DELPMLOGISTICSFAIL = "-1313"; //删除物流公司失败
    public final static String ERR_QRYPMLOGISTICSFAIL = "-1314"; //查询物流公司失败
    
    public final static String ERR_MBSMSSTATNODATA = "-1315"; //短信统计表记录不存在
    public final static String ERR_ADDMBSMSSTATFAIL = "-1316"; //插入短信统计表失败
    public final static String ERR_MODMBSMSSTATFAIL = "-1317"; //修改短信统计表失败
    public final static String ERR_DELMBSMSSTATFAIL = "-1318"; //删除短信统计表失败
    public final static String ERR_QRYMBSMSSTATFAIL = "-1319"; //查询短信统计表失败
    
    public final static String ERR_SCCHECKACCLOGNODATA = "-1320"; //对账日志记录不存在
    public final static String ERR_ADDSCCHECKACCLOGFAIL = "-1321"; //插入对账日志失败
    public final static String ERR_MODSCCHECKACCLOGFAIL = "-1322"; //修改对账日志失败
    public final static String ERR_DELSCCHECKACCLOGFAIL = "-1323"; //删除对账日志失败
    public final static String ERR_QRYSCCHECKACCLOGFAIL = "-1324"; //查询对账日志失败

    public final static String ERR_SCCHECKACCRESULTNODATA = "-1325"; //对账结果记录不存在
    public final static String ERR_ADDSCCHECKACCRESULTFAIL = "-1326"; //插入对账结果失败
    public final static String ERR_MODSCCHECKACCRESULTFAIL = "-1327"; //修改对账结果失败
    public final static String ERR_DELSCCHECKACCRESULTFAIL = "-1328"; //删除对账结果失败
    public final static String ERR_QRYSCCHECKACCRESULTFAIL = "-1329"; //查询对账结果失败

    public final static String ERR_TBLEDPARAMNODATA = "-1330"; //柜体LED信息记录不存在
    public final static String ERR_ADDTBLEDPARAMFAIL = "-1331"; //插入柜体LED信息失败
    public final static String ERR_MODTBLEDPARAMFAIL = "-1332"; //修改柜体LED信息失败
    public final static String ERR_DELTBLEDPARAMFAIL = "-1333"; //删除柜体LED信息失败
    public final static String ERR_QRYTBLEDPARAMFAIL = "-1334"; //查询柜体LED信息失败
    
    public final static String ERR_MBDELIVERYREPORTNODATA = "-1335"; //投递日报告记录不存在
    public final static String ERR_ADDMBDELIVERYREPORTFAIL = "-1336"; //插入投递日报告失败
    public final static String ERR_MODMBDELIVERYREPORTFAIL = "-1337"; //修改投递日报告失败
    public final static String ERR_DELMBDELIVERYREPORTFAIL = "-1338"; //删除投递日报告失败
    public final static String ERR_QRYMBDELIVERYREPORTFAIL = "-1339"; //查询投递日报告失败

    public final static String ERR_PTFEEDBACKFAILNODATA = "-1340"; //投递信息反馈失败表记录不存在
    public final static String ERR_ADDPTFEEDBACKFAILFAIL = "-1341"; //插入投递信息反馈失败表失败
    public final static String ERR_MODPTFEEDBACKFAILFAIL = "-1342"; //修改投递信息反馈失败表失败
    public final static String ERR_DELPTFEEDBACKFAILFAIL = "-1343"; //删除投递信息反馈失败表失败
    public final static String ERR_QRYPTFEEDBACKFAILFAIL = "-1344"; //查询投递信息反馈失败表失败

    public final static String ERR_PYSMSACCOUNTNODATA = "-1345"; //短信充值账户信息记录不存在
    public final static String ERR_ADDPYSMSACCOUNTFAIL = "-1346"; //插入短信充值账户信息失败
    public final static String ERR_MODPYSMSACCOUNTFAIL = "-1347"; //修改短信充值账户信息失败
    public final static String ERR_DELPYSMSACCOUNTFAIL = "-1348"; //删除短信充值账户信息失败
    public final static String ERR_QRYPYSMSACCOUNTFAIL = "-1349"; //查询短信充值账户信息失败

    public final static String ERR_PYSMSBILLWATERNODATA = "-1350"; //短信账单流水记录不存在
    public final static String ERR_ADDPYSMSBILLWATERFAIL = "-1351"; //插入短信账单流水失败
    public final static String ERR_MODPYSMSBILLWATERFAIL = "-1352"; //修改短信账单流水失败
    public final static String ERR_DELPYSMSBILLWATERFAIL = "-1353"; //删除短信账单流水失败
    public final static String ERR_QRYPYSMSBILLWATERFAIL = "-1354"; //查询短信账单流水失败

    public final static String ERR_PYSMSSERVICESNODATA = "-1355"; //短信服务套餐记录不存在
    public final static String ERR_ADDPYSMSSERVICESFAIL = "-1356"; //插入短信服务套餐失败
    public final static String ERR_MODPYSMSSERVICESFAIL = "-1357"; //修改短信服务套餐失败
    public final static String ERR_DELPYSMSSERVICESFAIL = "-1358"; //删除短信服务套餐失败
    public final static String ERR_QRYPYSMSSERVICESFAIL = "-1359"; //查询短信服务套餐失败

    public final static String ERR_MBCUSTOMERNODATA = "-1360"; //个人客户信息表记录不存在
    public final static String ERR_ADDMBCUSTOMERFAIL = "-1361"; //插入个人客户信息表失败
    public final static String ERR_MODMBCUSTOMERFAIL = "-1362"; //修改个人客户信息表失败
    public final static String ERR_DELMBCUSTOMERFAIL = "-1363"; //删除个人客户信息表失败
    public final static String ERR_QRYMBCUSTOMERFAIL = "-1364"; //查询个人客户信息表失败


    public final static String ERR_MBCUSTOMERTOGROUPNODATA = "-1365"; //用户分组表记录不存在
    public final static String ERR_ADDMBCUSTOMERTOGROUPFAIL = "-1366"; //插入用户分组表失败
    public final static String ERR_MODMBCUSTOMERTOGROUPFAIL = "-1367"; //修改用户分组表失败
    public final static String ERR_DELMBCUSTOMERTOGROUPFAIL = "-1368"; //删除用户分组表失败
    public final static String ERR_QRYMBCUSTOMERTOGROUPFAIL = "-1369"; //查询用户分组表失败

    public final static String ERR_MBGROUPNODATA = "-1370"; //用户分组记录不存在
    public final static String ERR_ADDMBGROUPFAIL = "-1371"; //插入用户分组失败
    public final static String ERR_MODMBGROUPFAIL = "-1372"; //修改用户分组失败
    public final static String ERR_DELMBGROUPFAIL = "-1373"; //删除用户分组失败
    public final static String ERR_QRYMBGROUPFAIL = "-1374"; //查询用户分组失败

    public final static String ERR_PYCONSUMEDCARDNODATA = "-1375"; //消费卡信息记录不存在
    public final static String ERR_ADDPYCONSUMEDCARDFAIL = "-1376"; //插入消费卡信息失败
    public final static String ERR_MODPYCONSUMEDCARDFAIL = "-1377"; //修改消费卡信息失败
    public final static String ERR_DELPYCONSUMEDCARDFAIL = "-1378"; //删除消费卡信息失败
    public final static String ERR_QRYPYCONSUMEDCARDFAIL = "-1379"; //查询消费卡信息失败

    public final static String ERR_PYTRANSACTIONWATERNODATA = "-1380"; //充值支付流水记录不存在
    public final static String ERR_ADDPYTRANSACTIONWATERFAIL = "-1381"; //插入充值支付流水失败
    public final static String ERR_MODPYTRANSACTIONWATERFAIL = "-1382"; //修改充值支付流水失败
    public final static String ERR_DELPYTRANSACTIONWATERFAIL = "-1383"; //删除充值支付流水失败
    public final static String ERR_QRYPYTRANSACTIONWATERFAIL = "-1384"; //查询充值支付流水失败

    public final static String ERR_TBTERMINALCHARGENODATA = "-1385"; //柜体格口收费标准记录不存在
    public final static String ERR_ADDTBTERMINALCHARGEFAIL = "-1386"; //插入柜体格口收费标准失败
    public final static String ERR_MODTBTERMINALCHARGEFAIL = "-1387"; //修改柜体格口收费标准失败
    public final static String ERR_DELTBTERMINALCHARGEFAIL = "-1388"; //删除柜体格口收费标准失败
    public final static String ERR_QRYTBTERMINALCHARGEFAIL = "-1389"; //查询柜体格口收费标准失败

    public final static String ERR_PYFEEDBACKFAILNODATA = "-1390"; //充值记录反馈失败表记录不存在
    public final static String ERR_ADDPYFEEDBACKFAILFAIL = "-1391"; //插入充值记录反馈失败表失败
    public final static String ERR_MODPYFEEDBACKFAILFAIL = "-1392"; //修改充值记录反馈失败表失败
    public final static String ERR_DELPYFEEDBACKFAILFAIL = "-1393"; //删除充值记录反馈失败表失败
    public final static String ERR_QRYPYFEEDBACKFAILFAIL = "-1394"; //查询充值记录反馈失败表失败

    public final static String ERR_BSBOXCHARGEDETAILNODATA = "-1395"; //格口收费标准详情记录不存在
    public final static String ERR_ADDBSBOXCHARGEDETAILFAIL = "-1396"; //插入格口收费标准详情失败
    public final static String ERR_MODBSBOXCHARGEDETAILFAIL = "-1397"; //修改格口收费标准详情失败
    public final static String ERR_DELBSBOXCHARGEDETAILFAIL = "-1398"; //删除格口收费标准详情失败
    public final static String ERR_QRYBSBOXCHARGEDETAILFAIL = "-1399"; //查询格口收费标准详情失败

    public final static String ERR_BSCHARGESTANDARDNODATA = "-1400"; //收费标准记录不存在
    public final static String ERR_ADDBSCHARGESTANDARDFAIL = "-1401"; //插入收费标准失败
    public final static String ERR_MODBSCHARGESTANDARDFAIL = "-1402"; //修改收费标准失败
    public final static String ERR_DELBSCHARGESTANDARDFAIL = "-1403"; //删除收费标准失败
    public final static String ERR_QRYBSCHARGESTANDARDFAIL = "-1404"; //查询收费标准失败

    public final static String ERR_BSCHARGETYPENODATA = "-1405"; //收费类型模式记录不存在
    public final static String ERR_ADDBSCHARGETYPEFAIL = "-1406"; //插入收费类型模式失败
    public final static String ERR_MODBSCHARGETYPEFAIL = "-1407"; //修改收费类型模式失败
    public final static String ERR_DELBSCHARGETYPEFAIL = "-1408"; //删除收费类型模式失败
    public final static String ERR_QRYBSCHARGETYPEFAIL = "-1409"; //查询收费类型模式失败

    public final static String ERR_BSCONFIGNODATA = "-1410"; //业务配置表记录不存在
    public final static String ERR_ADDBSCONFIGFAIL = "-1411"; //插入业务配置表失败
    public final static String ERR_MODBSCONFIGFAIL = "-1412"; //修改业务配置表失败
    public final static String ERR_DELBSCONFIGFAIL = "-1413"; //删除业务配置表失败
    public final static String ERR_QRYBSCONFIGFAIL = "-1414"; //查询业务配置表失败

    public final static String ERR_BSCONTROLPARAMNODATA = "-1415"; //业务控制参数记录不存在
    public final static String ERR_ADDBSCONTROLPARAMFAIL = "-1416"; //插入业务控制参数失败
    public final static String ERR_MODBSCONTROLPARAMFAIL = "-1417"; //修改业务控制参数失败
    public final static String ERR_DELBSCONTROLPARAMFAIL = "-1418"; //删除业务控制参数失败
    public final static String ERR_QRYBSCONTROLPARAMFAIL = "-1419"; //查询业务控制参数失败

    public final static String ERR_BSSERVICENODATA = "-1420"; //业务类型记录不存在
    public final static String ERR_ADDBSSERVICEFAIL = "-1421"; //插入业务类型失败
    public final static String ERR_MODBSSERVICEFAIL = "-1422"; //修改业务类型失败
    public final static String ERR_DELBSSERVICEFAIL = "-1423"; //删除业务类型失败
    public final static String ERR_QRYBSSERVICEFAIL = "-1424"; //查询业务类型失败
    
    public final static String ERR_MBCUSTOMERBOXRIGHTNODATA = "-1425"; //会员格口权限记录不存在
    public final static String ERR_ADDMBCUSTOMERBOXRIGHTFAIL = "-1426"; //插入会员格口权限失败
    public final static String ERR_MODMBCUSTOMERBOXRIGHTFAIL = "-1427"; //修改会员格口权限失败
    public final static String ERR_DELMBCUSTOMERBOXRIGHTFAIL = "-1428"; //删除会员格口权限失败
    public final static String ERR_QRYMBCUSTOMERBOXRIGHTFAIL = "-1429"; //查询会员格口权限失败

    public final static String ERR_MBCUSTOMERTERMINALRIGHTNODATA = "-1430"; //会员柜体权限记录不存在
    public final static String ERR_ADDMBCUSTOMERTERMINALRIGHTFAIL = "-1431"; //插入会员柜体权限失败
    public final static String ERR_MODMBCUSTOMERTERMINALRIGHTFAIL = "-1432"; //修改会员柜体权限失败
    public final static String ERR_DELMBCUSTOMERTERMINALRIGHTFAIL = "-1433"; //删除会员柜体权限失败
    public final static String ERR_QRYMBCUSTOMERTERMINALRIGHTFAIL = "-1434"; //查询会员柜体权限失败
    
    public final static String ERR_MBOPENBOXWATERNODATA = "-1435"; //开箱流水记录不存在
    public final static String ERR_ADDMBOPENBOXWATERFAIL = "-1436"; //插入开箱流水失败
    public final static String ERR_MODMBOPENBOXWATERFAIL = "-1437"; //修改开箱流水失败
    public final static String ERR_DELMBOPENBOXWATERFAIL = "-1438"; //删除开箱流水失败
    public final static String ERR_QRYMBOPENBOXWATERFAIL = "-1439"; //查询开箱流水失败
    
    public final static String ERR_TBSERVERBOXTYPENODATA = "-1440"; //运营端箱类型信息表记录不存在
    public final static String ERR_ADDTBSERVERBOXTYPEFAIL = "-1441"; //插入运营端箱类型信息表失败
    public final static String ERR_MODTBSERVERBOXTYPEFAIL = "-1442"; //修改运营端箱类型信息表失败
    public final static String ERR_DELTBSERVERBOXTYPEFAIL = "-1443"; //删除运营端箱类型信息表失败
    public final static String ERR_QRYTBSERVERBOXTYPEFAIL = "-1444"; //查询运营端箱类型信息表失败

    public final static String ERR_CMCUSTOMERNODATA = "-1445"; //会员信息记录不存在
    public final static String ERR_ADDCMCUSTOMERFAIL = "-1446"; //插入会员信息失败
    public final static String ERR_MODCMCUSTOMERFAIL = "-1447"; //修改会员信息失败
    public final static String ERR_DELCMCUSTOMERFAIL = "-1448"; //删除会员信息失败
    public final static String ERR_QRYCMCUSTOMERFAIL = "-1449"; //查询会员信息失败

    public final static String ERR_CMCUSTOMERBOXRIGHTNODATA = "-1450"; //会员格口权限记录不存在
    public final static String ERR_ADDCMCUSTOMERBOXRIGHTFAIL = "-1451"; //插入会员格口权限失败
    public final static String ERR_MODCMCUSTOMERBOXRIGHTFAIL = "-1452"; //修改会员格口权限失败
    public final static String ERR_DELCMCUSTOMERBOXRIGHTFAIL = "-1453"; //删除会员格口权限失败
    public final static String ERR_QRYCMCUSTOMERBOXRIGHTFAIL = "-1454"; //查询会员格口权限失败

    public final static String ERR_CMCUSTOMERCARDNODATA = "-1455"; //会员卡信息记录不存在
    public final static String ERR_ADDCMCUSTOMERCARDFAIL = "-1456"; //插入会员卡信息失败
    public final static String ERR_MODCMCUSTOMERCARDFAIL = "-1457"; //修改会员卡信息失败
    public final static String ERR_DELCMCUSTOMERCARDFAIL = "-1458"; //删除会员卡信息失败
    public final static String ERR_QRYCMCUSTOMERCARDFAIL = "-1459"; //查询会员卡信息失败

    public final static String ERR_CMCUSTOMERTERMINALRIGHTNODATA = "-1460"; //会员柜体权限记录不存在
    public final static String ERR_ADDCMCUSTOMERTERMINALRIGHTFAIL = "-1461"; //插入会员柜体权限失败
    public final static String ERR_MODCMCUSTOMERTERMINALRIGHTFAIL = "-1462"; //修改会员柜体权限失败
    public final static String ERR_DELCMCUSTOMERTERMINALRIGHTFAIL = "-1463"; //删除会员柜体权限失败
    public final static String ERR_QRYCMCUSTOMERTERMINALRIGHTFAIL = "-1464"; //查询会员柜体权限失败

    public final static String ERR_CMCUSTOMERTOGROUPNODATA = "-1465"; //会员分组表记录不存在
    public final static String ERR_ADDCMCUSTOMERTOGROUPFAIL = "-1466"; //插入会员分组表失败
    public final static String ERR_MODCMCUSTOMERTOGROUPFAIL = "-1467"; //修改会员分组表失败
    public final static String ERR_DELCMCUSTOMERTOGROUPFAIL = "-1468"; //删除会员分组表失败
    public final static String ERR_QRYCMCUSTOMERTOGROUPFAIL = "-1469"; //查询会员分组表失败

    public final static String ERR_CMELEACCOUNTNODATA = "-1470"; //会员电子账户信息不存在
    public final static String ERR_ADDCMELEACCOUNTFAIL = "-1471"; //插入会员电子账户信息失败
    public final static String ERR_MODCMELEACCOUNTFAIL = "-1472"; //修改会员电子账户信息失败
    public final static String ERR_DELCMELEACCOUNTFAIL = "-1473"; //删除会员电子账户信息失败
    public final static String ERR_QRYCMELEACCOUNTFAIL = "-1474"; //查询会员电子账户信息失败

    public final static String ERR_CMGROUPNODATA = "-1475"; //会员分组记录不存在
    public final static String ERR_ADDCMGROUPFAIL = "-1476"; //插入会员分组失败
    public final static String ERR_MODCMGROUPFAIL = "-1477"; //修改会员分组失败
    public final static String ERR_DELCMGROUPFAIL = "-1478"; //删除会员分组失败
    public final static String ERR_QRYCMGROUPFAIL = "-1479"; //查询会员分组失败

    public final static String ERR_CMCUSTOMERADDRESSNODATA = "-1485"; //会员地址信息记录不存在
    public final static String ERR_ADDCMCUSTOMERADDRESSFAIL = "-1486"; //插入会员地址信息失败
    public final static String ERR_MODCMCUSTOMERADDRESSFAIL = "-1487"; //修改会员地址信息失败
    public final static String ERR_DELCMCUSTOMERADDRESSFAIL = "-1488"; //删除会员地址信息失败
    public final static String ERR_QRYCMCUSTOMERADDRESSFAIL = "-1489"; //查询会员地址信息失败

    public final static String ERR_MBMSGSENDWATERNODATA = "-1490"; //短信发送流水记录不存在
    public final static String ERR_ADDMBMSGSENDWATERFAIL = "-1491"; //插入短信发送流水失败
    public final static String ERR_MODMBMSGSENDWATERFAIL = "-1492"; //修改短信发送流水失败
    public final static String ERR_DELMBMSGSENDWATERFAIL = "-1493"; //删除短信发送流水失败
    public final static String ERR_QRYMBMSGSENDWATERFAIL = "-1494"; //查询短信发送流水失败
    
    public final static String ERR_TBPDANODATA = "-1480"; //PDA信息记录不存在
    public final static String ERR_ADDTBPDAFAIL = "-1481"; //插入PDA信息失败
    public final static String ERR_MODTBPDAFAIL = "-1482"; //修改PDA信息失败
    public final static String ERR_DELTBPDAFAIL = "-1483"; //删除PDA信息失败
    public final static String ERR_QRYTBPDAFAIL = "-1484"; //查询PDA信息失败
    
    public final static String ERR_MBTERMINALUPGRADENODATA = "-1495"; //终端软件升级记录不存在
    public final static String ERR_ADDMBTERMINALUPGRADEFAIL = "-1496"; //插入终端软件升级失败
    public final static String ERR_MODMBTERMINALUPGRADEFAIL = "-1497"; //修改终端软件升级失败
    public final static String ERR_DELMBTERMINALUPGRADEFAIL = "-1498"; //删除终端软件升级失败
    public final static String ERR_QRYMBTERMINALUPGRADEFAIL = "-1499"; //查询终端软件升级失败


    public final static String ERR_PAMSGGATEWAYNODATA = "-1500"; //消息网关记录不存在
    public final static String ERR_ADDPAMSGGATEWAYFAIL = "-1501"; //插入消息网关失败
    public final static String ERR_MODPAMSGGATEWAYFAIL = "-1502"; //修改消息网关失败
    public final static String ERR_DELPAMSGGATEWAYFAIL = "-1503"; //删除消息网关失败
    public final static String ERR_QRYPAMSGGATEWAYFAIL = "-1504"; //查询消息网关失败

    public final static String ERR_PAMSGTEMPLATENODATA = "-1505"; //消息模本记录不存在
    public final static String ERR_ADDPAMSGTEMPLATEFAIL = "-1506"; //插入消息模本失败
    public final static String ERR_MODPAMSGTEMPLATEFAIL = "-1507"; //修改消息模本失败
    public final static String ERR_DELPAMSGTEMPLATEFAIL = "-1508"; //删除消息模本失败
    public final static String ERR_QRYPAMSGTEMPLATEFAIL = "-1509"; //查询消息模本失败

    public final static String ERR_PMCOMPANYCONFIGNODATA = "-1510"; //投递公司配置记录不存在
    public final static String ERR_ADDPMCOMPANYCONFIGFAIL = "-1511"; //插入投递公司配置失败
    public final static String ERR_MODPMCOMPANYCONFIGFAIL = "-1512"; //修改投递公司配置失败
    public final static String ERR_DELPMCOMPANYCONFIGFAIL = "-1513"; //删除投递公司配置失败
    public final static String ERR_QRYPMCOMPANYCONFIGFAIL = "-1514"; //查询投递公司配置失败

    public final static String ERR_SMTERMINALSOFTNODATA = "-1515"; //终端系统配套软件记录不存在
    public final static String ERR_ADDSMTERMINALSOFTFAIL = "-1516"; //插入终端系统配套软件失败
    public final static String ERR_MODSMTERMINALSOFTFAIL = "-1517"; //修改终端系统配套软件失败
    public final static String ERR_DELSMTERMINALSOFTFAIL = "-1518"; //删除终端系统配套软件失败
    public final static String ERR_QRYSMTERMINALSOFTFAIL = "-1519"; //查询终端系统配套软件失败

    public final static String ERR_SMUPGRADEPACKNODATA = "-1520"; //软件升级包记录不存在
    public final static String ERR_ADDSMUPGRADEPACKFAIL = "-1521"; //插入软件升级包失败
    public final static String ERR_MODSMUPGRADEPACKFAIL = "-1522"; //修改软件升级包失败
    public final static String ERR_DELSMUPGRADEPACKFAIL = "-1523"; //删除软件升级包失败
    public final static String ERR_QRYSMUPGRADEPACKFAIL = "-1524"; //查询软件升级包失败

    public final static String ERR_SMUPGRADEWATERNODATA = "-1525"; //软件升级流水记录不存在
    public final static String ERR_ADDSMUPGRADEWATERFAIL = "-1526"; //插入软件升级流水失败
    public final static String ERR_MODSMUPGRADEWATERFAIL = "-1527"; //修改软件升级流水失败
    public final static String ERR_DELSMUPGRADEWATERFAIL = "-1528"; //删除软件升级流水失败
    public final static String ERR_QRYSMUPGRADEWATERFAIL = "-1529"; //查询软件升级流水失败
}
