package net.davoleo.groovy

import groovy.beans.Bindable
import groovy.swing.SwingBuilder

import java.awt.*

class FastSwing {

    static class ExampleModel {
        @Bindable
        int boundCount = 0
    }

    static void main(String[] args) {
        def swing = new SwingBuilder()

        def count = 0

        swing.edt {
            frame(title: 'Example Frame', size: [250, 75], show: true, location: [100, 40]) {
                borderLayout()
                def textlabel = label(text: 'Click the button!', constraints: BorderLayout.NORTH)
                button(text: 'Click Me',
                    actionPerformed: {
                        count++
                        textlabel.text = "Clicked ${count} time(s)."
                        println "clicked"
                    }, constraints: BorderLayout.SOUTH
                )
            }
        }

        def model = new ExampleModel()
        swing.edt {
            frame(title: 'Binding Frame', size: [100, 100], locationRelativeTo: null, show: true) {
                gridLayout(columns: 1, rows: 2)
                label(text: bind(
                    source: model,
                    sourceProperty: 'boundCount',
                    converter: { val -> val != null ? "Clicked $val times" : '' }
                ))
                button('Click Me!', actionPerformed: {
                    model.boundCount++
                })
            }
        }
    }

}
