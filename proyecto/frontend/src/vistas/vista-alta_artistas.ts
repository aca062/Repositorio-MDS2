import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-password-field.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-select/src/vaadin-select.js';
import '@vaadin/vaadin-list-box/src/vaadin-list-box.js';
import '@vaadin/vaadin-item/src/vaadin-item.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-alta_artistas')
export class VistaAlta_artistas extends LitElement {
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
 <h2 id="h2" style="margin-left: 10%;">Dar de alta artista</h2>
 <vaadin-vertical-layout theme="spacing" style="margin-left: var(--lumo-space-xl); width: 100%;background-color: var(--lumo-contrast-10pct);">
  <vaadin-horizontal-layout id="vaadinHorizontalLayout" style="width: 90%; height: 20%;">
   <img id="img" src="https://pbs.twimg.com/media/E3ATxGdWQAcSfBe.jpg">
   <vaadin-button id="vaadinButton" style="align-self: center; margin-left: 5%;">
     Añadir foto 
   </vaadin-button>
  </vaadin-horizontal-layout>
  <vaadin-text-field label="Nick" id="nick" style="color: #000000" value="Bad Bunny"></vaadin-text-field>
  <vaadin-password-field label="Contraseña" placeholder="Enter password" value="secret1" style="color: #000000" has-value></vaadin-password-field>
  <vaadin-password-field label="Confirmar contraseña" placeholder="Enter password" value="secret1" has-value style="color: #000000"></vaadin-password-field>
  <vaadin-text-field label="E-mail" id="eMail" style="color: #000000" value="bbunny@gmail.com"></vaadin-text-field>
  <vaadin-select value="Reguetón" id="vaadinSelect">
   <template>
    <vaadin-list-box>
     <vaadin-item style="color: #000000" selected>
      Reguetón
     </vaadin-item>
     <vaadin-item>
       Item two 
     </vaadin-item>
     <vaadin-item>
       Item three 
     </vaadin-item>
    </vaadin-list-box>
   </template>
  </vaadin-select>
  <vaadin-horizontal-layout id="vaadinHorizontalLayout6" style="margin-left: 10%; width: 90%; justify-content: flex-end;">
   <vaadin-button id="vaadinButton1" style="margin-right: 5%;">
     Cancelar 
   </vaadin-button>
   <vaadin-button id="vaadinButton2" style="margin-right: 5%;">
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
