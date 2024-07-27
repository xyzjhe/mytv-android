package top.yogiczy.mytv.tv.ui.screens.settings

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableLongStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import top.yogiczy.mytv.core.data.entities.epg.EpgProgrammeReserveList
import top.yogiczy.mytv.core.data.entities.epgsource.EpgSourceList
import top.yogiczy.mytv.core.data.entities.iptvsource.IptvSourceList
import top.yogiczy.mytv.tv.ui.utils.Configs

class SettingsViewModel : ViewModel() {
    private var _appBootLaunch by mutableStateOf(Configs.appBootLaunch)
    var appBootLaunch: Boolean
        get() = _appBootLaunch
        set(value) {
            _appBootLaunch = value
            Configs.appBootLaunch = value
        }

    private var _appLastLatestVersion by mutableStateOf(Configs.appLastLatestVersion)
    var appLastLatestVersion: String
        get() = _appLastLatestVersion
        set(value) {
            _appLastLatestVersion = value
            Configs.appLastLatestVersion = value
        }

    private var _debugShowFps by mutableStateOf(Configs.debugShowFps)
    var debugShowFps: Boolean
        get() = _debugShowFps
        set(value) {
            _debugShowFps = value
            Configs.debugShowFps = value
        }

    private var _debugShowVideoPlayerMetadata by mutableStateOf(Configs.debugShowVideoPlayerMetadata)
    var debugShowVideoPlayerMetadata: Boolean
        get() = _debugShowVideoPlayerMetadata
        set(value) {
            _debugShowVideoPlayerMetadata = value
            Configs.debugShowVideoPlayerMetadata = value
        }

    private var _debugShowLayoutGrids by mutableStateOf(Configs.debugShowLayoutGrids)
    var debugShowLayoutGrids: Boolean
        get() = _debugShowLayoutGrids
        set(value) {
            _debugShowLayoutGrids = value
            Configs.debugShowLayoutGrids = value
        }

    private var _iptvLastChannelIdx by mutableIntStateOf(Configs.iptvLastChannelIdx)
    var iptvLastChannelIdx: Int
        get() = _iptvLastChannelIdx
        set(value) {
            _iptvLastChannelIdx = value
            Configs.iptvLastChannelIdx = value
        }

    private var _iptvChannelChangeFlip by mutableStateOf(Configs.iptvChannelChangeFlip)
    var iptvChannelChangeFlip: Boolean
        get() = _iptvChannelChangeFlip
        set(value) {
            _iptvChannelChangeFlip = value
            Configs.iptvChannelChangeFlip = value
        }

    private var _iptvSourceCacheTime by mutableLongStateOf(Configs.iptvSourceCacheTime)
    var iptvSourceCacheTime: Long
        get() = _iptvSourceCacheTime
        set(value) {
            _iptvSourceCacheTime = value
            Configs.iptvSourceCacheTime = value
        }

    private var _iptvSourceUrl by mutableStateOf(Configs.iptvSourceUrl)
    var iptvSourceUrl: String
        get() = _iptvSourceUrl
        set(value) {
            _iptvSourceUrl = value
            Configs.iptvSourceUrl = value
        }

    private var _iptvSourceList by mutableStateOf(Configs.iptvSourceList)
    var iptvSourceList: IptvSourceList
        get() = _iptvSourceList
        set(value) {
            _iptvSourceList = value
            Configs.iptvSourceList = value
        }

    private var _iptvPlayableHostList by mutableStateOf(Configs.iptvPlayableHostList)
    var iptvPlayableHostList: Set<String>
        get() = _iptvPlayableHostList
        set(value) {
            _iptvPlayableHostList = value
            Configs.iptvPlayableHostList = value
        }

    private var _iptvChannelNoSelectEnable by mutableStateOf(Configs.iptvChannelNoSelectEnable)
    var iptvChannelNoSelectEnable: Boolean
        get() = _iptvChannelNoSelectEnable
        set(value) {
            _iptvChannelNoSelectEnable = value
            Configs.iptvChannelNoSelectEnable = value
        }

    private var _iptvChannelFavoriteEnable by mutableStateOf(Configs.iptvChannelFavoriteEnable)
    var iptvChannelFavoriteEnable: Boolean
        get() = _iptvChannelFavoriteEnable
        set(value) {
            _iptvChannelFavoriteEnable = value
            Configs.iptvChannelFavoriteEnable = value
        }

    private var _iptvChannelFavoriteListVisible by mutableStateOf(Configs.iptvChannelFavoriteListVisible)
    var iptvChannelFavoriteListVisible: Boolean
        get() = _iptvChannelFavoriteListVisible
        set(value) {
            _iptvChannelFavoriteListVisible = value
            Configs.iptvChannelFavoriteListVisible = value
        }

    private var _iptvChannelFavoriteList by mutableStateOf(Configs.iptvChannelFavoriteList)
    var iptvChannelFavoriteList: Set<String>
        get() = _iptvChannelFavoriteList
        set(value) {
            _iptvChannelFavoriteList = value
            Configs.iptvChannelFavoriteList = value
        }

    private var _iptvChannelFavoriteChangeBoundaryJumpOut by mutableStateOf(Configs.iptvChannelFavoriteChangeBoundaryJumpOut)
    var iptvChannelFavoriteChangeBoundaryJumpOut: Boolean
        get() = _iptvChannelFavoriteChangeBoundaryJumpOut
        set(value) {
            _iptvChannelFavoriteChangeBoundaryJumpOut = value
            Configs.iptvChannelFavoriteChangeBoundaryJumpOut = value
        }

    private var _iptvChannelGroupHiddenList by mutableStateOf(Configs.iptvChannelGroupHiddenList)
    var iptvChannelGroupHiddenList: Set<String>
        get() = _iptvChannelGroupHiddenList
        set(value) {
            _iptvChannelGroupHiddenList = value
            Configs.iptvChannelGroupHiddenList = value
        }

    private var _iptvHybridMode by mutableStateOf(Configs.iptvHybridMode)
    var iptvHybridMode: Configs.IptvHybridMode
        get() = _iptvHybridMode
        set(value) {
            _iptvHybridMode = value
            Configs.iptvHybridMode = value
        }

    private var _epgEnable by mutableStateOf(Configs.epgEnable)
    var epgEnable: Boolean
        get() = _epgEnable
        set(value) {
            _epgEnable = value
            Configs.epgEnable = value
        }

    private var _epgXmlUrl by mutableStateOf(Configs.epgXmlUrl)
    var epgXmlUrl: String
        get() = _epgXmlUrl
        set(value) {
            _epgXmlUrl = value
            Configs.epgXmlUrl = value
        }

    private var _epgSourceList by mutableStateOf(Configs.epgSourceList)
    var epgSourceList: EpgSourceList
        get() = _epgSourceList
        set(value) {
            _epgSourceList = value
            Configs.epgSourceList = value
        }

    private var _epgRefreshTimeThreshold by mutableIntStateOf(Configs.epgRefreshTimeThreshold)
    var epgRefreshTimeThreshold: Int
        get() = _epgRefreshTimeThreshold
        set(value) {
            _epgRefreshTimeThreshold = value
            Configs.epgRefreshTimeThreshold = value
        }

    private var _epgChannelReserveList by mutableStateOf(Configs.epgChannelReserveList)
    var epgChannelReserveList: EpgProgrammeReserveList
        get() = _epgChannelReserveList
        set(value) {
            _epgChannelReserveList = value
            Configs.epgChannelReserveList = value
        }

    private var _uiShowEpgProgrammeProgress by mutableStateOf(Configs.uiShowEpgProgrammeProgress)
    var uiShowEpgProgrammeProgress: Boolean
        get() = _uiShowEpgProgrammeProgress
        set(value) {
            _uiShowEpgProgrammeProgress = value
            Configs.uiShowEpgProgrammeProgress = value
        }

    private var _uiShowChannelLogo by mutableStateOf(Configs.uiShowChannelLogo)
    var uiShowChannelLogo: Boolean
        get() = _uiShowChannelLogo
        set(value) {
            _uiShowChannelLogo = value
            Configs.uiShowChannelLogo = value
        }

    private var _uiUseClassicPanelScreen by mutableStateOf(Configs.uiUseClassicPanelScreen)
    var uiUseClassicPanelScreen: Boolean
        get() = _uiUseClassicPanelScreen
        set(value) {
            _uiUseClassicPanelScreen = value
            Configs.uiUseClassicPanelScreen = value
        }

    private var _uiDensityScaleRatio by mutableFloatStateOf(Configs.uiDensityScaleRatio)
    var uiDensityScaleRatio: Float
        get() = _uiDensityScaleRatio
        set(value) {
            _uiDensityScaleRatio = value
            Configs.uiDensityScaleRatio = value
        }

    private var _uiFontScaleRatio by mutableFloatStateOf(Configs.uiFontScaleRatio)
    var uiFontScaleRatio: Float
        get() = _uiFontScaleRatio
        set(value) {
            _uiFontScaleRatio = value
            Configs.uiFontScaleRatio = value
        }

    private var _uiTimeShowMode by mutableStateOf(Configs.uiTimeShowMode)
    var uiTimeShowMode: Configs.UiTimeShowMode
        get() = _uiTimeShowMode
        set(value) {
            _uiTimeShowMode = value
            Configs.uiTimeShowMode = value
        }

    private var _updateForceRemind by mutableStateOf(Configs.updateForceRemind)
    var updateForceRemind: Boolean
        get() = _updateForceRemind
        set(value) {
            _updateForceRemind = value
            Configs.updateForceRemind = value
        }

    private var _videoPlayerUserAgent by mutableStateOf(Configs.videoPlayerUserAgent)
    var videoPlayerUserAgent: String
        get() = _videoPlayerUserAgent
        set(value) {
            _videoPlayerUserAgent = value
            Configs.videoPlayerUserAgent = value
        }

    private var _videoPlayerLoadTimeout by mutableLongStateOf(Configs.videoPlayerLoadTimeout)
    var videoPlayerLoadTimeout: Long
        get() = _videoPlayerLoadTimeout
        set(value) {
            _videoPlayerLoadTimeout = value
            Configs.videoPlayerLoadTimeout = value
        }

    private var _videoPlayerAspectRatio by mutableStateOf(Configs.videoPlayerAspectRatio)
    var videoPlayerAspectRatio: Configs.VideoPlayerAspectRatio
        get() = _videoPlayerAspectRatio
        set(value) {
            _videoPlayerAspectRatio = value
            Configs.videoPlayerAspectRatio = value
        }

    init {
        // 删除过期的预约
        _epgChannelReserveList = EpgProgrammeReserveList(
            _epgChannelReserveList.filter {
                System.currentTimeMillis() < it.startAt + 60 * 1000
            }
        )
    }
}