package net.hwyz.iov.cloud.framework.audit.service;

import net.hwyz.iov.cloud.framework.common.constant.MptSecurityConstants;
import net.hwyz.iov.cloud.mpt.system.api.RemoteLogService;
import net.hwyz.iov.cloud.mpt.system.api.domain.SysOperLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * 异步调用日志服务
 *
 * @author hwyz_leo
 */
@Service
public class AsyncLogService {
    @Autowired
    private RemoteLogService remoteLogService;

    /**
     * 保存系统日志记录
     */
    @Async
    public void saveSysLog(SysOperLog sysOperLog) throws Exception {
        remoteLogService.saveLog(sysOperLog, MptSecurityConstants.INNER);
    }
}
