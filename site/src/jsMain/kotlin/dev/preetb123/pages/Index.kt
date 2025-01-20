package dev.preetb123.pages

import androidx.compose.runtime.*
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.maxWidth
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.width
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.silk.components.text.SpanText
import org.jetbrains.compose.web.dom.Text
import com.varabyte.kobweb.worker.rememberWorker
import dev.preetb123.worker.EchoWorker
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Br

@Page
@Composable
fun HomePage() {
    val worker = rememberWorker { EchoWorker { output -> console.log("Echoed: $output") } }
    LaunchedEffect(Unit) {
        worker.postInput("Hello, worker!")
    }

    // TODO: Replace the following with your own content
    Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Column(modifier = Modifier.maxWidth(1024.px).padding(24.px)) {
            SpanText("Hello, I am a Software Engineer specializing in cross-platform apps development primarily with Compose/Kotlin Multiplatform.")
            SpanText("I like to do high impact work with minimal efforts. Constantly in quest for technologies that simplify dev and end user experience.")
            Br()
            SpanText("Contact me: preetb123 at gmail.com")
        }
    }
}
