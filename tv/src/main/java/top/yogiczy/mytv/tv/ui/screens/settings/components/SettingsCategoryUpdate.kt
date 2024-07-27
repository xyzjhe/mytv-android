package top.yogiczy.mytv.tv.ui.screens.settings.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.tv.material3.Switch
import top.yogiczy.mytv.tv.ui.screens.settings.SettingsViewModel

@Composable
fun SettingsCategoryUpdate(
    modifier: Modifier = Modifier,
    settingsViewModel: SettingsViewModel = viewModel(),
) {
    SettingsContentList(modifier) {
        item {
            SettingsListItem(
                headlineContent = "更新强提醒",
                supportingContent = if (settingsViewModel.updateForceRemind) "检测到新版本时会全屏提醒"
                else "检测到新版本时仅消息提示",
                trailingContent = {
                    Switch(checked = settingsViewModel.updateForceRemind, onCheckedChange = null)
                },
                onSelected = {
                    settingsViewModel.updateForceRemind = !settingsViewModel.updateForceRemind
                },
            )
        }
    }
}