import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-ver_creditos')
export class VistaVer_creditos extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vaadin-vertical-layout theme="spacing">
  <h3 style="margin: var(--lumo-space-xl); margin-bottom: var(--lumo-space-m);">Ver créditos</h3>
  <h4 style="margin: var(--lumo-space-xl); margin-top: 0; margin-bottom: 0;">Título de la canción</h4>
  <h4 style="margin: var(--lumo-space-xl); margin-top: 0; margin-bottom: 0;">Título del álbum</h4>
  <h4 style="margin: var(--lumo-space-xl); margin-top: 0; margin-bottom: 0;">Compositores</h4>
  <h4 style="margin: var(--lumo-space-xl); margin-top: 0; margin-bottom: 0;">Productores</h4>
  <h4 style="margin: var(--lumo-space-xl); margin-bottom: 0; margin-top: 0;">Intérpretes</h4>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
