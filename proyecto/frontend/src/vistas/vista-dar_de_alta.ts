import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-dar_de_alta')
export class VistaDar_de_alta extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout">
 <h2 id="h2" style="margin-left: 10%;">Altas</h2>
 <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout1" style="width: 80%; align-self: center; align-items: center;">
  <vaadin-horizontal-layout theme="" style="margin-left: 10%; width: 80%; justify-content: space-around;" id="vaadinHorizontalLayout">
   <vaadin-button id="vaadinButton">
    Artistas
   </vaadin-button>
   <vaadin-button id="vaadinButton1">
    Canciones
   </vaadin-button>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="" id="vaadinHorizontalLayout1" style="margin-left: 10%; width: 80%; justify-content: space-around;">
   <vaadin-button id="vaadinButton3">
    Álbumes
   </vaadin-button>
   <vaadin-button id="vaadinButton2">
    Estilos
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
