import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-cabecera_cibernauta')
export class VistaCabecera_cibernauta extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; justify-content: space-between;" id="layoutPrincipal">
 <vaadin-horizontal-layout id="layoutCabecera" style="width: 100%; justify-content: space-between; background-color: var(--lumo-contrast-10pct);" background-color="">
  <vaadin-button id="logo" style="margin: var(--lumo-space-l);">
    Logo 
  </vaadin-button>
  <vaadin-button id="iniciarSesion" style="margin: var(--lumo-space-l);">
    Iniciar sesión 
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" id="contacto" style="width: 100%; background-color: var(--lumo-contrast-10pct);"></vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
