import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';

@customElement('vista-anadir_evento')
export class VistaAnadir_evento extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; padding-left: var(--lumo-space-xl);" id="vaadinVerticalLayout">
 <h2 id="h2">Añadir evento</h2>
 <vaadin-vertical-layout id="vaadinVerticalLayout1" style="width: 100%; height: 100%;background-color: var(--lumo-contrast-10pct);">
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="align-items: center; width: 30%;">
   <img id="img" style="width: 200px;" src="https://cdn-icons-png.flaticon.com/512/42/42956.png">
   <vaadin-button id="vaadinButton" style="margin-left: var(--lumo-space-xl);">
     Añadir foto 
   </vaadin-button>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1" style="width: 100%;">
   <vaadin-text-field label="Fecha" id="fecha" style="width: 70%;" value="14/04/2022"></vaadin-text-field>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout2" style="width: 100%;">
   <vaadin-text-field label="Hora" id="hora" style="width: 70%;" value="1.00"></vaadin-text-field>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout3" style="width: 100%;">
   <vaadin-text-field label="Lugar" id="lugar" style="width: 70%;" value="State farm arena"></vaadin-text-field>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout id="vaadinHorizontalLayout4" style="justify-content: space-around; width: 100%;">
   <vaadin-button id="vaadinButton1">
     Cancelar 
   </vaadin-button>
   <vaadin-button id="vaadinButton2" style="flex-grow: 0; flex-shrink: 1;">
     Confirmar 
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
